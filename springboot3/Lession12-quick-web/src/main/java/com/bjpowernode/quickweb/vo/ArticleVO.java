package com.bjpowernode.quickweb.vo;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ArticleVO {

    // 建立組，組就是接口名
    public static interface AddArticleGroup{};
    public static interface EditArticleGroup{};

    @NotNull(message = "文章id必須有值", groups = {EditArticleGroup.class})
    @Min(value = 3, message = "id大於0", groups = {EditArticleGroup.class})
    private Integer id;

    @NotNull(message = "不可為空，必須有作者", groups = {AddArticleGroup.class, EditArticleGroup.class})
    private Integer userId;

    @NotBlank(message = "不可為空，必須有標題", groups = {AddArticleGroup.class, EditArticleGroup.class})
    // @Size 認為 null 是有效值
    @Size(min = 3, max = 30,message = "標題字數在3~30字之間", groups = {AddArticleGroup.class, EditArticleGroup.class})
    private String title;

    @NotBlank(message = "不可為空，必須要有副標題", groups = {AddArticleGroup.class, EditArticleGroup.class})
    @Size(min = 5, max = 60, message = "副標題字數在5~60之間", groups = {AddArticleGroup.class, EditArticleGroup.class})
    private String summary;

    @DecimalMin(value = "0", message = "閱讀數量不可小於 0", groups = {AddArticleGroup.class, EditArticleGroup.class})
    private Integer readCount;

    @Email(message = "email不符合規則", groups = {AddArticleGroup.class, EditArticleGroup.class})
    private String email;

}
