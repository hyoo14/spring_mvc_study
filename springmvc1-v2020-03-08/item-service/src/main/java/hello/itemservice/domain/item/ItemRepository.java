package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository //스프링으로 리포지토리 만듬. 컴포넌트스캔의 대상
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>(); //static //실제로는 해쉬맵 쓰면 안 됨, 동시에 여러 쓰레드가 접근할 때 특히 해쉬맵 쓰면 안되고 만약에 사용하고 싶으면/
    // /컨쿼런트 해쉬맵 써야함
    private static long sequence = 0L; //static //실제로는 어토믹롱 등 다른 거 사용해야

    public Item save(Item item) { //저장하는 기능
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }

    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }

    public void update(Long itemId, Item updateParam) { //사실 dto 사용해야함. 중복이더라도 명확성이 있어서(dto 만들어서 사용하는 것은). 프로젝트 작으니까 그냥 한 것.
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }

    public void clearStore() {
        store.clear();
    }

}
