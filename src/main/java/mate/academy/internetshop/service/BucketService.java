package mate.academy.internetshop.service;

import mate.academy.internetshop.model.Bucket;
import mate.academy.internetshop.model.Item;

import java.util.List;

public interface BucketService {
    Bucket create(Bucket bucket);

    Bucket get(Long bucketId);

    Bucket update(Bucket bucket);

    boolean delete(Long bucketId);

    boolean delete(Bucket bucket);

    void addItem(Bucket bucket, Item item);

    void deleteItem(Bucket bucket, Item item);

    void clear(Bucket bucket);

    List<Item> getAllItems(Bucket bucket);
}