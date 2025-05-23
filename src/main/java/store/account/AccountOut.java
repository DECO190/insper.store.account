package store.account;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent = true)
public record AccountOut(
    String id,
    String name,
    String email
) {
}