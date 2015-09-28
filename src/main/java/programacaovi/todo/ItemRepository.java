/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovi.todo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Rodrigo
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {
    
}
