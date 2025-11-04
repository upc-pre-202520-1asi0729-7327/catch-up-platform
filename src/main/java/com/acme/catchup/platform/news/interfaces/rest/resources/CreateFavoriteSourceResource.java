package com.acme.catchup.platform.news.interfaces.rest.resources;

import jakarta.validation.constraints.NotBlank;

public record CreateFavoriteSourceResource(
        @NotBlank(message = "{favorite.source.error.newsApiKey.notBlank}")
        String newsApiKey,
        @NotBlank(message = "{favorite.source.error.sourceId.notBlank}")
        String sourceId) {}