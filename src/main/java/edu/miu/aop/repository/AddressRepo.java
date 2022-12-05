package edu.miu.aop.repository;

import edu.miu.aop.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * @author Ankhbayar Azzaya
 */
@Service
public interface AddressRepo extends CrudRepository<Address, Integer> {

}
