package com.acme.catchup.platform.news.interfaces.rest.transform;

import com.acme.catchup.platform.news.domain.model.aggregates.FavoriteSource;
import com.acme.catchup.platform.news.interfaces.rest.resources.FavoriteSourceResource;

public class FavoriteSourceResourceFromEntityAssembler {
    public static FavoriteSourceResource toResourceFromEntity(FavoriteSource entity) {
        if (entity == null) {
            throw new IllegalArgumentException("entity must not be null");
        }
        return new FavoriteSourceResource(
                entity.getId(),
                entity.getNewsApiKey(),
                entity.getSourceId()
        );
    }
}
