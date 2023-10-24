package enum_practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public enum Status {
    OK(200, "요청 성공"),
    MULTIPLE_CHOICE(300, "하나 이상의 응답 가능"),
    BAD_REQUEST(400, "서버가 요청을 이해할 수 없음"),
    NOT_FOUND(404, "요청받은 리소스를 찾을 수 없음");

    private final int code;
    private final String detail;

    private static final Map<Integer, Status> CODE_MAP = Collections.unmodifiableMap(
            Arrays.stream(values()).collect(Collectors.toMap(Status::getCode, o -> o))
    );

    Status(int code, String detail) {
        this.code = code;
        this.detail = detail;
    }

    public int getCode() {
        return code;
    }

    public String getDetail() {
        return detail;
    }

    public static Status findByCode(int code) {
        return Arrays.stream(values()).filter(o -> o.getCode() == code)
                .findFirst()
                .orElse(Status.NOT_FOUND);
    }

    public static Status findByCodeMap(int code) {
        if (!CODE_MAP.containsKey(code)) {
            return null;
        }
        return CODE_MAP.get(code);
    }

    @Override
    public String toString() {
        return name() + "{" +
                "code=" + code +
                ", detail='" + detail + '\'' +
                '}';
    }
}
