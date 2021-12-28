package az.elvin.constructionAdmin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {


    private Long id;

    private String nameAz;

    private String nameEn;

    private String nameRu;

}
