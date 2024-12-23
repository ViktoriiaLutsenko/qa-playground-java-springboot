package com.vlutsenko.qaplaygroundjavaspring.page.multileveldropdown.repository;

import com.vlutsenko.qaplaygroundjavaspring.page.multileveldropdown.entity.Submenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmenuRepository extends JpaRepository<Submenu, String> {
}
