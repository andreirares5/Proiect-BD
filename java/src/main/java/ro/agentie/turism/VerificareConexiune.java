package ro.agentie.turism;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/** Clasa pentru verificarea conexiunii la baza de date
 * @author Șolcă Andrei-Rareș
 * @version 20 Noiembrie 2026
 */

@Component
public class VerificareConexiune implements CommandLineRunner
{
    private final JdbcTemplate jdbcTemplate;

    public VerificareConexiune (JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args)
    {
        String numeBD =  jdbcTemplate.queryForObject("SELECT DB_NAME()", String.class);
        System.out.println("Conexiune realizata");
        System.out.println("Numele bazei de date: " + numeBD);
    }
}
