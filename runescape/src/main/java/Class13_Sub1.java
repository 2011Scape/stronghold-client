import com.jagex.core.util.SystemTimer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class13_Sub1 extends Class13 {

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)J")
    @Override
    public long method5161() {
        return SystemTimer.safetime() * 1000000L;
    }
}
