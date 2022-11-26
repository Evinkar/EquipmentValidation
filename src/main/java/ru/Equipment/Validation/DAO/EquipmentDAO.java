package ru.Equipment.Validation.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.Equipment.Validation.model.Equipment;

import java.sql.Connection;
import java.util.List;

@Component
public class EquipmentDAO {
    private JdbcTemplate jdbcTemplate;
    private Connection connection;

    @Autowired
    public EquipmentDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Equipment> ShowAll(){
        return jdbcTemplate.query("SELECT * FROM Equipment", new BeanPropertyRowMapper<>());
    }
}

// insert into equipment (registrationCardNumber, name, serialNumber, inventoryNumber, verificationCertificationNumber, validationLastDate, validationNextDate) values ()
//insert into equipment (registrationCardNumber, name, serialNumber, inventoryNumber, verificationCertificationNumber, validationLastDate, validationNextDate)
//    values ('СИ-А10', 'рН-метр Testo-206-рН', '58815241/0721', 'БЕ-00051244', 'С-СЕ/22-11-2021/112053812', '2021-11-22', '2022-11-21')