package dk.via.nbnp.databaseserver.application.serviceInterfaces;

import dk.via.nbnp.databaseserver.domain.Item;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IItemService {

    List<Item> getItems();
    Item createItem(Item product);
    Item getItemById(Long id) throws Exception;
    void deleteById(Long id);
}
