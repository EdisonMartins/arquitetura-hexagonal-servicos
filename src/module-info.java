module conta.servicos {
    // usa sistema
    requires sistema;

    // usa spring
    requires javax.inject;
    requires spring.tx;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires java.sql;
    requires spring.jdbc;

    // abre respositorio
    opens conta.servicos.repositorio;
    opens test.java.teste.integracao;
}