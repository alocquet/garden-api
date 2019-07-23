package eu.alocquet.garden.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Seed {
    @NonNull
    private String id;
    @NonNull
    private String name;
}
