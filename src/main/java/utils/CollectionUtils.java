package utils;

import java.util.Collection;

public final class CollectionUtils {

  private CollectionUtils() {}

  public static <T> boolean isNullOrEmpty(Collection<T> collection) {
    if (collection == null) {
      return true;
    }

    if (collection.isEmpty()) {
      return true;
    }

    return false;
  }
}