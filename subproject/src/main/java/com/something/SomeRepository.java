package com.something;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SomeRepository extends JpaRepository<SomeEntity, Long> {
}
