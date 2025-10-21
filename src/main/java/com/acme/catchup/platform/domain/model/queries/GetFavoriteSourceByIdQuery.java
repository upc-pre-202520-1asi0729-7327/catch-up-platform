package com.acme.catchup.platform.domain.model.queries;

public record GetFavoriteSourceByIdQuery(Long id) {
    public GetFavoriteSourceByIdQuery {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("id must not be null or less than or equal to zero");
        }
    }
}
