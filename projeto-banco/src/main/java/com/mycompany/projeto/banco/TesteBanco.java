package com.mycompany.projeto.banco;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class TesteBanco {
    
    public static void main(String[] args) {
     
        Connection config = new Connection();
        
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        List listPokemon01 = template.queryForList("select * from pokemon");
        
        System.out.println(listPokemon01);
    }
}
