import com.jagex.game.runetek6.config.fonttype.FontTypeList;
import com.jagex.graphics.Toolkit;
import com.jagex.js5.js5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static667 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!kda;")
    public static final Class204 aClass204_15 = new Class204(8, 1);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZLjava/lang/String;I)V")
    public static void method8695(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int toolkit) {
        Static419.method5757();
        Static231.method3375();
        Static208.method3106();
        Static595.method7807(arg1, arg0, toolkit);
        FontTypeList.method2569();
        FontTypeList.method7549(Toolkit.active);
        Fonts.init(Toolkit.active);
        Sprites.init(js5.SPRITES, Toolkit.active);
        Static329.method1649();
        MiniMenu.method4925(Sprites.nameIcons);
        InterfaceManager.redrawAll();
        Static296.updateFeatureMask();
        if (MainLogicManager.step == 3) {
            MainLogicManager.setStep(4);
        } else if (MainLogicManager.step == 7) {
            MainLogicManager.setStep(8);
        } else if (MainLogicManager.step == 9) {
            MainLogicManager.setStep(10);
        } else if (MainLogicManager.step == 11) {
            MainLogicManager.setStep(12);
        } else if (MainLogicManager.step == 1 || MainLogicManager.step == 2) {
            Static143.method3572();
        }
    }
}
