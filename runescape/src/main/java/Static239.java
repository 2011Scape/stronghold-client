import com.jagex.core.datastruct.key.Deque;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "Lclient!sia;")
    public static final Deque A_DEQUE___19 = new Deque();

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)I")
    public static int method3474(@OriginalArg(1) int arg0) {
        @Pc(7) int local7 = arg0 & 0x3F;
        @Pc(13) int local13 = arg0 >> 6 & 0x3;
        if (local7 == 18) {
            if (local13 == 0) {
                return 1;
            }
            if (local13 == 1) {
                return 2;
            }
            if (local13 == 2) {
                return 4;
            }
            if (local13 == 3) {
                return 8;
            }
        } else if (local7 == 19 || local7 == 21) {
            if (local13 == 0) {
                return 16;
            }
            if (local13 == 1) {
                return 32;
            }
            if (local13 == 2) {
                return 64;
            }
            if (local13 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
