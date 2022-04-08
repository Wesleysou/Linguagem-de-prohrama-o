package com.mycompany.projeto.banco;

import com.github.javafaker.Faker;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TesteBanco {
    
    public static void main(String[] args) {  
        
        Faker nomes = new Faker();
        
        //Esse objeto guarda as config do banco
        Connection config = new Connection();
        
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        
        //Apagando a tabela caso exista
        template.execute("DROP TABLE IF EXISTS pokemon");
        
        String criacaoTabelaPokemon = "CREATE TABLE pokemon("
                                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                                    + "nome VARCHAR(255),"
                                    + "tipo VARCHAR(255),"
                                    + ")";
        
        template.execute(criacaoTabelaPokemon);
        
        for (int i = 0; i < 10; i++) {
        
            String nomesPokemon = nomes.pokemon().name();
            String cidadePoke = nomes.pokemon().location();
           
            template.update(String.format("INSERT INTO pokemon VALUES(null,'%s', '%s')", nomesPokemon, cidadePoke));
        }
        
        List<Pokemon> listPokemon01 = template.query("select * from pokemon",
                new BeanPropertyRowMapper<>(Pokemon.class));
        
        
//        for (int i = 0; i < listPokemon01.size(); i++) {
//            
//            System.out.println(listPokemon01.get(i));
//        }
//        

        for (Pokemon pokemon : listPokemon01) {
            System.out.println(pokemon);
            }
            
        }
    }

