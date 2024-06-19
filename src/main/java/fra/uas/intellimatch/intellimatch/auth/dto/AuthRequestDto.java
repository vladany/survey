package fra.uas.intellimatch.intellimatch.auth.dto;


import io.swagger.v3.oas.annotations.media.Schema;

@Schema
public record AuthRequestDto(@Schema(example = "admin", description = "this filed  use to pass username") String username,
                             @Schema(example = "admin", description = "this filed  use to pass password") String password) {
}