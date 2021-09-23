package uns.pmf.konfback.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uns.pmf.konfback.entity.*;

import javax.persistence.Entity;
import java.net.http.HttpResponse;


@RestController
public class RegistrationController {
    @Autowired
    OsobaRepository or;

    @Autowired
    UlogaRepository ur;

    @CrossOrigin
    @PostMapping(value = "/login")
    public ResponseEntity<TokenResponse> login(@RequestBody Creds creds) {
        System.out.println(creds.getUsername() + " " + creds.getPassword());
        Osoba user = or.findByEmail(creds.getUsername());
        if ( user == null){
            return ResponseEntity.ok(new TokenResponse());
        }
        TokenResponse tr = new TokenResponse();
        tr.setToken(user.getUloga().getNaziv());
        return ResponseEntity.ok(tr);
    }

    @CrossOrigin
    @PostMapping(value = "/register")
    public ResponseEntity<Boolean> register(@RequestBody Osoba osoba) {
        System.out.println((osoba));
        Uloga korisnik = ur.findByNaziv("USER");
        osoba.setUloga(korisnik);

        try{
            or.save(osoba);
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }

    @GetMapping(value = "/isLoggedIn")
    public ResponseEntity<Boolean> isLoggedIn() {
        /*
        return ResponseEntity.ok(isLoggedIn);
        */
         return ResponseEntity.ok(true);
    }

    @GetMapping(value = "/logout")
    public ResponseEntity<Boolean> logout() {
        return ResponseEntity.ok(true);


    }
}
