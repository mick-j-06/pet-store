package com.example.petstore.controller.mapper;

import com.example.petstore.controller.dto.TagDto;
import com.example.petstore.model.Tag;
import org.springframework.stereotype.Component;

@Component
public class TagMapper {
    public TagDto toRest(Tag tag) {
        return TagDto.builder()
                .id(tag.getId())
                .name(tag.getName())
                .build();
    }

    public Tag toDomain(TagDto tagDto) {
        Tag tag = new Tag();
        tag.setId(tagDto.getId());
        tag.setName(tagDto.getName());
        return tag;
    }
}
