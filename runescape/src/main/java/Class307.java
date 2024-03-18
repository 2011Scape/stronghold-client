import com.jagex.collect.ref.ReferenceCache;
import com.jagex.core.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class307 {

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Lclient!dla;")
    public final ReferenceCache aReferenceCache_168 = new ReferenceCache(16);

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "Lclient!sb;")
    public final js5 aJs5_100;

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
    public Class307(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) js5 arg2) {
        this.aJs5_100 = arg2;
        this.aJs5_100.method7608(29);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
    public void method7068() {
        @Pc(13) ReferenceCache local13 = this.aReferenceCache_168;
        synchronized (this.aReferenceCache_168) {
            this.aReferenceCache_168.clean(5);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public void method7069() {
        @Pc(10) ReferenceCache local10 = this.aReferenceCache_168;
        synchronized (this.aReferenceCache_168) {
            this.aReferenceCache_168.removeSoftReferences();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Lclient!ema;")
    public Class108 method7070(@OriginalArg(0) int arg0) {
        @Pc(6) ReferenceCache local6 = this.aReferenceCache_168;
        @Pc(22) Class108 local22;
        synchronized (this.aReferenceCache_168) {
            local22 = (Class108) this.aReferenceCache_168.get((long) arg0);
        }
        if (local22 != null) {
            return local22;
        }
        @Pc(36) js5 local36 = this.aJs5_100;
        @Pc(45) byte[] local45;
        synchronized (this.aJs5_100) {
            local45 = this.aJs5_100.method7595(arg0, 29);
        }
        local22 = new Class108();
        if (local45 != null) {
            local22.method2447(new Packet(local45));
        }
        @Pc(69) ReferenceCache local69 = this.aReferenceCache_168;
        synchronized (this.aReferenceCache_168) {
            this.aReferenceCache_168.put(local22, (long) arg0);
            return local22;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public void method7071() {
        @Pc(2) ReferenceCache local2 = this.aReferenceCache_168;
        synchronized (this.aReferenceCache_168) {
            this.aReferenceCache_168.reset();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!dg;IIIIZ)Lclient!gm;")
    public Class148 method7072(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
        @Pc(13) Class216[] local13 = null;
        @Pc(18) Class108 local18 = this.method7070(arg2);
        if (local18.anIntArray232 != null) {
            local13 = new Class216[local18.anIntArray232.length];
            for (@Pc(28) int local28 = 0; local28 < local13.length; local28++) {
                @Pc(37) Class10 local37 = arg0.method2051(local18.anIntArray232[local28]);
                local13[local28] = new Class216(local37.anInt129, local37.anInt124, local37.anInt125, local37.anInt130, local37.anInt132, local37.anInt123, local37.anInt131, local37.aBoolean10, local37.anInt128, local37.anInt133, local37.anInt126);
            }
        }
        return new Class148(local18.anInt2629, local13, local18.anInt2624, arg4, arg3, arg1, local18.anInt2625, local18.anInt2621);
    }
}
