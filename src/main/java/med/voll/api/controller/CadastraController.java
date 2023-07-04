package med.voll.api.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class CadastraController {
    @RestController
    @RequestMapping("cadastrar")
    public static class CadastarController {

        @PostMapping
        public void cadastrar( @RequestBody DadosCadastroProduto dados) {
            System.out.println(dados);
        }

    }
}
