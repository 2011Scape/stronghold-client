import com.jagex.game.LocalisedText;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "[Z")
    public static boolean[] aBooleanArray11;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "[Ljava/lang/Object;")
    public static Object[] anObjectArray35;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "F")
    public static float aFloat82;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method4072() {
        Static161.anInt2797 = Fonts.p12Metrics.paddingTop + Fonts.p12Metrics.paddingBottom + 2;
        Static393.aStringArray32 = new String[500];
        Static644.anInt9608 = Fonts.b12Metrics.paddingBottom + Fonts.b12Metrics.paddingTop + 2;
        for (@Pc(35) int local35 = 0; local35 < Static393.aStringArray32.length; local35++) {
            Static393.aStringArray32[local35] = "";
        }
        Static79.method1579(LocalisedText.DEBUG_CONSOLE_INFO.localise(Static51.language));
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Z")
    public static boolean method4074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }
}
