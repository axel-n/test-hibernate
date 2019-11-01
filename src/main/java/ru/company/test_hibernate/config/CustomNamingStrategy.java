package ru.company.test_hibernate.config;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomNamingStrategy extends PhysicalNamingStrategyStandardImpl {

    @Value("${PREFIX}")
    private String tablePrefix;

    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        Identifier newIdentifier = new Identifier(tablePrefix + name.getText(), name.isQuoted());
        return super.toPhysicalTableName(newIdentifier, context);
    }
}
