package devPilot.backend.dto;

import java.util.UUID;

public record UserResponse (
    Long id,
    String githubId,
    String githubUsername,
    String displayName,
    String avatarUrl
){

    public UserResponse(UUID id2, long githubId2, String githubUsername2, String displayName2, String avatarUrl2) {
        this(id2 == null ? null : id2.getMostSignificantBits(), String.valueOf(githubId2), githubUsername2, displayName2, avatarUrl2);
    }

}
//8d722fdbe2759976048915959fe612f0c14b0721

// Ov23liock1VlTQP5S5p0
