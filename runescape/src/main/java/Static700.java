import com.jagex.Client;
import com.jagex.graphics.Exception_Sub1;
import com.jagex.graphics.Toolkit;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.Rectangle;

public final class Static700 {

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
    public static void method9148(@OriginalArg(1) int arg0, @OriginalArg(2) Rectangle[] rectangles) throws Exception_Sub1 {
        if (Static448.anInt6796 == 1) {
            Static74.aToolkit_4.method8011(rectangles, arg0, Static2.anInt45, Static312.anInt5001);
        } else {
            Static74.aToolkit_4.method8011(rectangles, arg0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZ)Z")
    public static boolean method9150(@OriginalArg(0) int arg0) {
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
    public static void method9152() {
        Static563.method7461();
        for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
            Client.collisionMaps[local16].reset();
        }
        Minimap.resetSprite();
        client.cacheReset();
        VideoManager.stop();
        System.gc();
        Toolkit.active.ya();
    }

}
