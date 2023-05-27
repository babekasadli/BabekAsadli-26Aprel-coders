package may27;

import java.util.List;

public enum RoleEnum {
    ADMIN(List.of("main", "login", "accesscontrol")), USER(List.of("login")), DEVELOPER(List.of("all_page"));

    List<String> accessPages;

    RoleEnum(List<String> accessPages) {
        this.accessPages = accessPages;
    }
}
