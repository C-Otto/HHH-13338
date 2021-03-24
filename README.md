To reproduce:
`./gradlew test -i`

Deleting the first child from the list gives:
```
2021-03-24 14:36:09.774 DEBUG 1808063 --- [    Test worker] org.hibernate.SQL                        : 
    delete 
    from
        some_entity_children 
    where
        some_entity_id=? 
        and children_order=?
Hibernate: 
    delete 
    from
        some_entity_children 
    where
        some_entity_id=? 
        and children_order=?
2021-03-24 14:36:09.775 TRACE 1808063 --- [    Test worker] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [4]
2021-03-24 14:36:09.776 TRACE 1808063 --- [    Test worker] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [INTEGER] - [2]
2021-03-24 14:36:09.778 DEBUG 1808063 --- [    Test worker] org.hibernate.SQL                        : 
    update
        some_entity_children 
    set
        children_id=? 
    where
        some_entity_id=? 
        and children_order=?
Hibernate: 
    update
        some_entity_children 
    set
        children_id=? 
    where
        some_entity_id=? 
        and children_order=?
2021-03-24 14:36:09.780 TRACE 1808063 --- [    Test worker] o.h.type.descriptor.sql.BasicBinder      : binding parameter [1] as [BIGINT] - [2]
2021-03-24 14:36:09.781 TRACE 1808063 --- [    Test worker] o.h.type.descriptor.sql.BasicBinder      : binding parameter [2] as [BIGINT] - [4]
2021-03-24 14:36:09.783 TRACE 1808063 --- [    Test worker] o.h.type.descriptor.sql.BasicBinder      : binding parameter [3] as [INTEGER] - [0]
2021-03-24 14:36:09.786  WARN 1808063 --- [    Test worker] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 23505, SQLState: 23505
2021-03-24 14:36:09.786 ERROR 1808063 --- [    Test worker] o.h.engine.jdbc.spi.SqlExceptionHelper   : Unique index or primary key violation: "PUBLIC.UK_J7FBI4K0SGNAQ7FMF8PW7UTKH_INDEX_1 ON PUBLIC.SOME_ENTITY_CHILDREN(CHILDREN_ID) VALUES 2"; SQL statement:
update some_entity_children set children_id=? where some_entity_id=? and children_order=? [23505-200]
```
