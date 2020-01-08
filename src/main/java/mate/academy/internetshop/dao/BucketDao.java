package mate.academy.internetshop.dao;

import mate.academy.internetshop.model.Bucket;
import java.util.Optional;

public interface BucketDao {
    Bucket create(Bucket bucket);

    Optional<Bucket> get(Long bucketId);

    Bucket update(Bucket bucket);

    boolean deleteById(Long bucketId);

    boolean delete(Bucket bucket);
}
