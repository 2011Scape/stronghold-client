import com.jagex.core.constants.LocLayer;
import com.jagex.core.constants.LocShapes;
import com.jagex.core.constants.TileFlag;
import com.jagex.core.io.Packet;
import com.jagex.game.runetek6.config.loctype.LocInteractivity;
import com.jagex.game.runetek6.config.loctype.LocOcclusionMode;
import com.jagex.game.runetek6.config.loctype.LocType;
import com.jagex.graphics.Ground;
import com.jagex.graphics.PointLight;
import com.jagex.graphics.Toolkit;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class MapRegion extends Class306 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Z")
    public static final boolean occlude = false;
    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Z")
    public static final boolean forceOcclusion = false;
    // $FF: synthetic field
    @OriginalMember(owner = "client!taa", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class locClass;
    @OriginalMember(owner = "client!taa", name = "K", descriptor = "I")
    public int maxLevel = 99;

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(IIIZ)V")
    public MapRegion(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
        super(arg0, arg1, arg2, arg3, Static467.aFloorOverlayTypeList_3, Static540.aFloorUnderlayTypeList_6);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZIII)I")
    public static int rotateLightX(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        @Pc(3) int local3 = arg2 & 0x3;
        if (local3 == 0) {
            return arg0;
        } else if (local3 == 1) {
            return arg1;
        } else if (local3 == 2) {
            return 4095 - arg0;
        } else {
            return 4095 - arg1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)I")
    public static int rotateLightZ(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(3) int local3 = arg1 & 0x3;
        if (local3 == 0) {
            return arg0;
        } else if (local3 == 1) {
            return 4095 - arg2;
        } else if (local3 == 2) {
            return 4095 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!th;)V")
    public static void method9122(@OriginalArg(0) EnvironmentLight arg0) {
        if (Static319.anInt5080 >= 65535) {
            return;
        }
        @Pc(7) PointLight local7 = arg0.light;
        Static265.aEnvironmentLightArray1[Static319.anInt5080] = arg0;
        Static279.aBooleanArray11[Static319.anInt5080] = false;
        Static319.anInt5080++;
        @Pc(22) int local22 = arg0.level;
        if (arg0.aBoolean716) {
            local22 = 0;
        }
        @Pc(30) int local30 = arg0.level;
        if (arg0.aBoolean717) {
            local30 = Static299.anInt4824 - 1;
        }
        for (@Pc(39) int local39 = local22; local39 <= local30; local39++) {
            @Pc(42) int local42 = 0;
            @Pc(54) int local54 = local7.getZ() + Static247.anInt3993 - local7.getRange() >> Static52.anInt1066;
            if (local54 < 0) {
                local42 = -local54;
                local54 = 0;
            }
            @Pc(74) int local74 = local7.getZ() + local7.getRange() - Static247.anInt3993 >> Static52.anInt1066;
            if (local74 >= Static662.anInt9843) {
                local74 = Static662.anInt9843 - 1;
            }
            for (@Pc(83) int local83 = local54; local83 <= local74; local83++) {
                @Pc(90) short local90 = arg0.aShortArray131[local42++];
                @Pc(106) int local106 = (local7.getX() + Static247.anInt3993 - local7.getRange() >> Static52.anInt1066) + (local90 >>> 8);
                @Pc(114) int local114 = local106 + (local90 & 0xFF) - 1;
                if (local106 < 0) {
                    local106 = 0;
                }
                if (local114 >= Static619.anInt1566) {
                    local114 = Static619.anInt1566 - 1;
                }
                for (@Pc(127) int local127 = local106; local127 <= local114; local127++) {
                    @Pc(136) long local136 = Static161.aLongArrayArrayArray1[local39][local127][local83];
                    if ((local136 & 0xFFFFL) == 0L) {
                        Static161.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static319.anInt5080;
                    } else if ((local136 & 0xFFFF0000L) == 0L) {
                        Static161.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static319.anInt5080 << 16;
                    } else if ((local136 & 0xFFFF00000000L) == 0L) {
                        Static161.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static319.anInt5080 << 32;
                    } else if ((local136 & 0xFFFF000000000000L) == 0L) {
                        Static161.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static319.anInt5080 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)I")
    public static int rotateZoneX(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
        @Pc(3) int local3 = arg2 & 0x3;
        if (local3 == 0) {
            return arg0;
        } else if (local3 == 1) {
            return arg1;
        } else if (local3 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBI)I")
    public static int rotateZoneY(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
        @Pc(7) int local7 = arg2 & 0x3;
        if (local7 == 0) {
            return arg0;
        } else if (local7 == 1) {
            return 7 - arg1;
        } else if (local7 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIBIIII)I")
    public static int rotateLocX(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
        @Pc(3) int local3 = arg5 & 0x3;
        if ((arg3 & 0x1) == 1) {
            @Pc(10) int local10 = arg0;
            arg0 = arg2;
            arg2 = local10;
        }
        if (local3 == 0) {
            return arg4;
        } else if (local3 == 1) {
            return arg1;
        } else if (local3 == 2) {
            return 7 + 1 - arg4 - arg0;
        } else {
            return 7 + 1 - arg1 - arg2;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIIIII)I")
    public static int rotateLocZ(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
        if ((arg3 & 0x1) == 1) {
            @Pc(12) int local12 = arg4;
            arg4 = arg2;
            arg2 = local12;
        }
        @Pc(20) int local20 = arg0 & 0x3;
        if (local20 == 0) {
            return arg1;
        } else if (local20 == 1) {
            return 1 + 7 - arg4 - arg5;
        } else if (local20 == 2) {
            return 1 + 7 - arg2 - arg1;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(III[Lclient!eq;Lclient!ha;[B)V")
    public void loadLocations(@OriginalArg(0) int offsetX, @OriginalArg(1) int offsetZ, @OriginalArg(3) CollisionMap[] arg2, @OriginalArg(4) Toolkit toolkit, @OriginalArg(5) byte[] arg4) {
        @Pc(8) Packet packet = new Packet(arg4);
        @Pc(18) int id = -1;
        while (true) {
            @Pc(22) int idOffset = packet.gExtended1or2();
            if (idOffset == 0) {
                return;
            }
            id += idOffset;

            @Pc(30) int coord = 0;
            while (true) {
                @Pc(34) int coordOffset = packet.gsmart();
                if (coordOffset == 0) {
                    break;
                }
                coord += coordOffset - 1;

                @Pc(46) int locZ = coord & 0x3F;
                @Pc(52) int locX = coord >> 6 & 0x3F;
                @Pc(56) int locLevel = coord >> 12;
                @Pc(60) int shapeAndRotation = packet.g1();
                @Pc(64) int locShape = shapeAndRotation >> 2;
                @Pc(68) int locRotation = shapeAndRotation & 0x3;
                @Pc(73) int x = locX + offsetX;
                @Pc(77) int z = locZ + offsetZ;
                if (x > 0 && z > 0 && x < super.width - 1 && z < super.height - 1) {
                    @Pc(102) CollisionMap collisionMap = null;
                    if (!super.underwater) {
                        @Pc(107) int actualLevel = locLevel;
                        if ((Static280.tileFlags[1][x][z] & TileFlag.BRIDGE) == 2) {
                            actualLevel = locLevel - 1;
                        }
                        if (actualLevel >= 0) {
                            collisionMap = arg2[actualLevel];
                        }
                    }
                    this.loadLocation(locShape, id, collisionMap, z, toolkit, x, locRotation, locLevel, locLevel, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILclient!ge;ILclient!ha;I)V")
    public void method7893(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Toolkit arg3) {
        if (super.underwater) {
            return;
        }
        @Pc(10) boolean local10 = false;
        @Pc(12) Environment local12 = null;
        while (true) {
            while (true) {
                while (true) {
                    while (true) {
                        @Pc(28) int local28;
                        @Pc(86) int local86;
                        @Pc(504) int local504;
                        @Pc(143) int local143;
                        @Pc(147) int local147;
                        while (arg1.data.length > arg1.pos) {
                            local28 = arg1.g1();
                            if (local28 != 0) {
                                @Pc(149) int local149;
                                @Pc(153) int local153;
                                @Pc(290) int local290;
                                if (local28 == 1) {
                                    local86 = arg1.g1();
                                    if (local86 > 0) {
                                        for (local504 = 0; local504 < local86; local504++) {
                                            @Pc(512) EnvironmentLight local512 = new EnvironmentLight(arg3, arg1, 2);
                                            if (local512.preset == 31) {
                                                @Pc(523) LightType local523 = Static48.aClass384_1.list(arg1.g2());
                                                local512.updateParameters(local523.anInt10374, local523.anInt10372, local523.anInt10373, local523.anInt10377);
                                            }
                                            if (arg3.getMaxLights() > 0) {
                                                @Pc(543) PointLight local543 = local512.light;
                                                local149 = (arg2 << 9) + local543.getX();
                                                local153 = (arg0 << 9) + local543.getZ();
                                                local290 = local149 >> 9;
                                                @Pc(567) int local567 = local153 >> 9;
                                                if (local290 >= 0 && local567 >= 0 && super.width > local290 && super.height > local567) {
                                                    local543.setPosition(local149, local153, super.tileHeights[local512.level][local290][local567] - local543.getY());
                                                    method9122(local512);
                                                }
                                            }
                                        }
                                    }
                                } else if (local28 == 2) {
                                    if (local12 == null) {
                                        local12 = new Environment();
                                    }
                                    local12.decodeBloomParams(arg1);
                                } else if (local28 == 128) {
                                    if (local12 == null) {
                                        local12 = new Environment();
                                    }
                                    local12.method8384(arg1);
                                } else if (local28 == 129) {
                                    if (super.aByteArrayArrayArray12 == null) {
                                        super.aByteArrayArrayArray12 = new byte[4][][];
                                    }
                                    local10 = true;
                                    for (local86 = 0; local86 < 4; local86++) {
                                        @Pc(91) byte local91 = arg1.g1b();
                                        if (local91 == 0 && super.aByteArrayArrayArray12[local86] != null) {
                                            local143 = arg2;
                                            local147 = arg2 + 64;
                                            local149 = arg0;
                                            local153 = arg0 + 64;
                                            if (arg2 < 0) {
                                                local143 = 0;
                                            } else if (arg2 >= super.width) {
                                                local143 = super.width;
                                            }
                                            if (arg0 < 0) {
                                                local149 = 0;
                                            } else if (arg0 >= super.height) {
                                                local149 = super.height;
                                            }
                                            if (local147 < 0) {
                                                local147 = 0;
                                            } else if (super.width <= local147) {
                                                local147 = super.width;
                                            }
                                            if (local153 < 0) {
                                                local153 = 0;
                                            } else if (local153 >= super.height) {
                                                local153 = super.height;
                                            }
                                            while (local147 > local143) {
                                                while (local149 < local153) {
                                                    super.aByteArrayArrayArray12[local86][local143][local149] = 0;
                                                    local149++;
                                                }
                                                local143++;
                                            }
                                        } else if (local91 == 1) {
                                            if (super.aByteArrayArrayArray12[local86] == null) {
                                                super.aByteArrayArrayArray12[local86] = new byte[super.width + 1][super.height + 1];
                                            }
                                            for (local143 = 0; local143 < 64; local143 += 4) {
                                                for (local147 = 0; local147 < 64; local147 += 4) {
                                                    @Pc(280) byte local280 = arg1.g1b();
                                                    for (local153 = local143 + arg2; local153 < local143 + arg2 + 4; local153++) {
                                                        for (local290 = arg0 + local147; local290 < arg0 + local147 + 4; local290++) {
                                                            if (local153 >= 0 && super.width > local153 && local290 >= 0 && super.height > local290) {
                                                                super.aByteArrayArrayArray12[local86][local153][local290] = local280;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (local91 == 2) {
                                            if (super.aByteArrayArrayArray12[local86] == null) {
                                                super.aByteArrayArrayArray12[local86] = new byte[super.width + 1][super.height + 1];
                                            }
                                            if (local86 > 0) {
                                                local143 = arg2;
                                                local147 = arg2 + 64;
                                                local149 = arg0;
                                                local153 = arg0 + 64;
                                                if (local147 < 0) {
                                                    local147 = 0;
                                                } else if (super.width <= local147) {
                                                    local147 = super.width;
                                                }
                                                if (arg2 < 0) {
                                                    local143 = 0;
                                                } else if (arg2 >= super.width) {
                                                    local143 = super.width;
                                                }
                                                if (arg0 < 0) {
                                                    local149 = 0;
                                                } else if (arg0 >= super.height) {
                                                    local149 = super.height;
                                                }
                                                if (local153 < 0) {
                                                    local153 = 0;
                                                } else if (local153 >= super.height) {
                                                    local153 = super.height;
                                                }
                                                while (local143 < local147) {
                                                    while (local153 > local149) {
                                                        super.aByteArrayArrayArray12[local86][local143][local149] = super.aByteArrayArrayArray12[local86 - 1][local143][local149];
                                                        local149++;
                                                    }
                                                    local143++;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("");
                                }
                            } else if (local12 == null) {
                                local12 = new Environment(arg1);
                            } else {
                                local12.method8386(arg1);
                            }
                        }
                        if (local12 != null) {
                            for (local28 = 0; local28 < 8; local28++) {
                                for (local86 = 0; local86 < 8; local86++) {
                                    local504 = local28 + (arg2 >> 3);
                                    local143 = local86 + (arg0 >> 3);
                                    if (local504 >= 0 && super.width >> 3 > local504 && local143 >= 0 && super.height >> 3 > local143) {
                                        Static108.method2064(local143, local504, local12);
                                    }
                                }
                            }
                        }
                        if (!local10 && super.aByteArrayArrayArray12 != null) {
                            for (local28 = 0; local28 < 4; local28++) {
                                if (super.aByteArrayArrayArray12[local28] != null) {
                                    for (local86 = 0; local86 < 16; local86++) {
                                        for (local504 = 0; local504 < 16; local504++) {
                                            local143 = (arg2 >> 2) + local86;
                                            local147 = (arg0 >> 2) + local504;
                                            if (local143 >= 0 && local143 < 26 && local147 >= 0 && local147 < 26) {
                                                super.aByteArrayArrayArray12[local28][local143][local147] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IILclient!eq;ILclient!ha;IIIIII)V")
    public void loadLocation(@OriginalArg(0) int shape, @OriginalArg(1) int arg1, @OriginalArg(2) CollisionMap collisionMap, @OriginalArg(3) int z, @OriginalArg(4) Toolkit toolkit, @OriginalArg(5) int x, @OriginalArg(6) int rotation, @OriginalArg(8) int arg7, @OriginalArg(9) int level, @OriginalArg(10) int animation) {
        boolean animatingBackground = ClientOptions.instance.animatingBackground.value() != 0;
        boolean tileVisible = Static696.isTileVisibleFrom(z, Static164.areaLevel, x, arg7);
        if (!animatingBackground && !tileVisible) {
            return;
        }

        if (level < this.maxLevel) {
            this.maxLevel = level;
        }

        @Pc(40) LocType locType = Static354.aLocTypeList_4.list(arg1);
        boolean texturesEnabled = ClientOptions.instance.textures.value() == 0;
        if (texturesEnabled && locType.requiresTextures) {
            return;
        }

        @Pc(65) int locWidth;
        @Pc(68) int locLength;
        if (rotation == 1 || rotation == 3) {
            locLength = locType.width;
            locWidth = locType.length;
        } else {
            locWidth = locType.width;
            locLength = locType.length;
        }

        @Pc(100) int x0;
        @Pc(94) int x1;
        if (x + locWidth <= super.width) {
            x1 = (locWidth + 1 >> 1) + x;
            x0 = (locWidth >> 1) + x;
        } else {
            x1 = x + 1;
            x0 = x;
        }

        @Pc(123) int z0;
        @Pc(121) int z1;
        if (super.height < locLength + z) {
            z1 = z + 1;
            z0 = z;
        } else {
            z0 = z + (locLength >> 1);
            z1 = z + (locLength + 1 >> 1);
        }

        @Pc(143) Ground ground = Static246.activeGround[arg7];
        int bottomLeftHeight = ground.getHeight(z0, x0);
        int bottomRightHeight = ground.getHeight(z0, x1);
        int topLeftHeight = ground.getHeight(z1, x0);
        int topRightHeight = ground.getHeight(z1, x1);
        @Pc(170) int averageHeight = (bottomLeftHeight + bottomRightHeight + topLeftHeight + topRightHeight) >> 2;

        @Pc(179) int absX = (x << 9) + (locWidth << 8);
        @Pc(187) int absZ = (locLength << 8) + (z << 9);

        @Pc(204) boolean local204 = Static404.aBoolean465 && !super.underwater && locType.copyNormals;

        if (locType.hasSounds()) {
            Static89.method1714(level, null, x, z, null, locType, rotation);
        }

        @Pc(248) boolean isStatic = animation == -1 && !locType.hasAnimations() && locType.multiLocs == null && !locType.animated && !locType.aBoolean91;

        boolean occludeWall = LocShapes.isWall(shape) && locType.locOcclusionMode != LocOcclusionMode.ALL;
        boolean occludeRoof = LocShapes.isRoof(shape) && locType.locOcclusionMode == LocOcclusionMode.ROOFS;
        if (occlude && (occludeWall || occludeRoof)) {
            return;
        }

        if (shape == LocShapes.GROUNDDECOR) {
            if (ClientOptions.instance.groundDecor.value() == 0 && locType.interactivity == LocInteractivity.NONINTERACTIVE && locType.movementPolicy != 1 && !locType.obstructiveGround) {
                return;
            }

            @Pc(325) GroundDecor decor;
            if (isStatic) {
                @Pc(341) StaticGroundDecor staticDecor = new StaticGroundDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, rotation, local204);

                decor = staticDecor;

                if (staticDecor.castsShadow()) {
                    staticDecor.addShadow(toolkit);
                }
            } else {
                decor = new DynamicGroundDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, rotation, animation);
            }

            Static61.method1299(level, x, z, decor);

            if (locType.movementPolicy == 1 && collisionMap != null) {
                collisionMap.flagGroundDecor(z, x);
            }
        } else if (shape == LocShapes.CENTREPIECE_STRAIGHT || shape == LocShapes.CENTREPIECE_DIAGONAL) {
            @Pc(420) PositionEntity loc;
            @Pc(384) StaticLocation staticLoc = null;
            @Pc(424) int local424;

            if (isStatic) {
                @Pc(416) StaticLocation staticLocation = new StaticLocation(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, x, x + locWidth - 1, z, z + locLength - 1, shape, rotation, local204);
                staticLoc = staticLocation;
                loc = staticLocation;
                local424 = staticLocation.method4222();
            } else {
                local424 = 15;
                loc = new DynamicLocation(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, x, x + locWidth - 1, z, z + locLength - 1, shape, rotation, animation);
            }

            if (Static102.method2026(loc, false)) {
                if (staticLoc != null && staticLoc.castsShadow()) {
                    staticLoc.addShadow(toolkit);
                }

                if (locType.castsShadow && Static404.aBoolean465) {
                    if (local424 > 30) {
                        local424 = 30;
                    }

                    for (@Pc(492) int locX = 0; locX <= locWidth; locX++) {
                        for (@Pc(495) int locZ = 0; locZ <= locLength; locZ++) {
                            ground.ka(locX + locX, locZ + locZ, local424);
                        }
                    }
                }
            }

            if (locType.movementPolicy != 0 && collisionMap != null) {
                collisionMap.flagRect(x, locLength, z, !locType.routingHint, locWidth, locType.blockRanged);
            }
        } else if (shape >= LocShapes.ROOF_STRAIGHT && shape <= LocShapes.ROOF_FLAT || shape >= LocShapes.ROOFEDGE_STRAIGHT && shape <= LocShapes.ROOFEDGE_SQUARECORNER) {
            @Pc(420) PositionEntity loc;
            @Pc(384) StaticLocation staticLoc;

            if (isStatic) {
                staticLoc = new StaticLocation(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, x, x + locWidth - 1, z, z + locLength - 1, shape, rotation, local204);

                if (staticLoc.castsShadow()) {
                    staticLoc.addShadow(toolkit);
                }

                loc = staticLoc;
            } else {
                loc = new DynamicLocation(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, x, locWidth + x - 1, z, z + locLength - 1, shape, rotation, animation);
            }

            Static102.method2026(loc, false);

            boolean occludeRoofs = locType.locOcclusionMode == LocOcclusionMode.ROOFS;
            if (Static404.aBoolean465 && !super.underwater && shape >= LocShapes.ROOF_STRAIGHT && shape <= LocShapes.ROOF_FLAT && shape != LocShapes.ROOF_DIAGONAL_WITH_ROOFEDGE && level > 0 && !occludeRoofs) {
                super.occlurerFlags[level][x][z] = (byte) (super.occlurerFlags[level][x][z] | 0x4);
            }

            if (locType.movementPolicy != 0 && collisionMap != null) {
                collisionMap.flagRect(x, locLength, z, !locType.routingHint, locWidth, locType.blockRanged);
            }
        } else if (shape == LocShapes.WALL_STRAIGHT) {
            @Pc(774) Wall wall;

            @Pc(744) int occlusionMode = locType.locOcclusionMode;
            if (forceOcclusion && locType.locOcclusionMode == LocOcclusionMode.NONE) {
                occlusionMode = LocOcclusionMode.ALL;
            }

            if (isStatic) {
                @Pc(772) StaticWall staticWall = new StaticWall(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, shape, rotation, local204);
                wall = staticWall;

                if (staticWall.castsShadow()) {
                    staticWall.addShadow(toolkit);
                }
            } else {
                wall = new DynamicWall(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, shape, rotation, animation);
            }

            Static584.method7665(level, x, z, wall, (Wall) null);

            if (rotation == 0) {
                if (Static404.aBoolean465 && locType.castsShadow) {
                    ground.ka(x, z, 50);
                    ground.ka(x, z + 1, 50);
                }

                if (occlusionMode == LocOcclusionMode.ALL && !super.underwater) {
                    Static177.addLocationOccluder(1, locType.occlusionOffset, z, x, level, locType.occlusionHeight);
                }
            } else if (rotation == 1) {
                if (Static404.aBoolean465 && locType.castsShadow) {
                    ground.ka(x, z + 1, 50);
                    ground.ka(x + 1, z - -1, 50);
                }

                if (occlusionMode == LocOcclusionMode.ALL && !super.underwater) {
                    Static177.addLocationOccluder(2, -locType.occlusionOffset, z + 1, x, level, locType.occlusionHeight);
                }
            } else if (rotation == 2) {
                if (Static404.aBoolean465 && locType.castsShadow) {
                    ground.ka(x + 1, z, 50);
                    ground.ka(x + 1, z + 1, 50);
                }

                if (occlusionMode == LocOcclusionMode.ALL && !super.underwater) {
                    Static177.addLocationOccluder(1, -locType.occlusionOffset, z, x + 1, level, locType.occlusionHeight);
                }
            } else if (rotation == 3) {
                if (Static404.aBoolean465 && locType.castsShadow) {
                    ground.ka(x, z, 50);
                    ground.ka(x + 1, z, 50);
                }

                if (occlusionMode == LocOcclusionMode.ALL && !super.underwater) {
                    Static177.addLocationOccluder(2, locType.occlusionOffset, z, x, level, locType.occlusionHeight);
                }
            }

            if (locType.movementPolicy != 0 && collisionMap != null) {
                collisionMap.flagWall(locType.blockRanged, !locType.routingHint, z, rotation, shape, x);
            }

            if (locType.anInt1243 != 64) {
                Static411.method5666(level, x, z, locType.anInt1243);
            }
        } else if (shape == LocShapes.WALL_DIAGONALCORNER) {
            @Pc(1079) Wall wall;
            @Pc(1096) StaticWall staticWall;

            if (isStatic) {
                staticWall = new StaticWall(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, shape, rotation, local204);
                wall = staticWall;

                if (staticWall.castsShadow()) {
                    staticWall.addShadow(toolkit);
                }
            } else {
                wall = new DynamicWall(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, shape, rotation, animation);
            }

            Static584.method7665(level, x, z, wall, (Wall) null);

            if (locType.castsShadow && Static404.aBoolean465) {
                if (rotation == 0) {
                    ground.ka(x, z + 1, 50);
                } else if (rotation == 1) {
                    ground.ka(x + 1, z - -1, 50);
                } else if (rotation == 2) {
                    ground.ka(x + 1, z, 50);
                } else if (rotation == 3) {
                    ground.ka(x, z, 50);
                }
            }

            if (locType.movementPolicy != 0 && collisionMap != null) {
                collisionMap.flagWall(locType.blockRanged, !locType.routingHint, z, rotation, shape, x);
            }
        } else if (shape == LocShapes.WALL_L) {
            @Pc(1079) Wall wall;
            @Pc(774) Wall adjacentWall;

            @Pc(424) int rotation90 = (rotation + 1) & 0x3;

            if (isStatic) {
                @Pc(1267) StaticWall staticWall = new StaticWall(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, shape, rotation + 4, local204);
                @Pc(1283) StaticWall adjacentStaticWall = new StaticWall(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, shape, rotation90, local204);

                if (staticWall.castsShadow()) {
                    staticWall.addShadow(toolkit);
                }

                adjacentWall = adjacentStaticWall;

                if (adjacentStaticWall.castsShadow()) {
                    adjacentStaticWall.addShadow(toolkit);
                }

                wall = staticWall;
            } else {
                wall = new DynamicWall(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, shape, rotation + 4, animation);
                adjacentWall = new DynamicWall(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, shape, rotation90, animation);
            }

            Static584.method7665(level, x, z, wall, adjacentWall);

            boolean occlude = (locType.locOcclusionMode == LocOcclusionMode.ALL) || (forceOcclusion && locType.locOcclusionMode == -1);
            if (occlude && !super.underwater) {
                if (rotation == 0) {
                    Static177.addLocationOccluder(1, locType.occlusionOffset, z, x, level, locType.occlusionHeight);
                    Static177.addLocationOccluder(2, locType.occlusionOffset, z + 1, x, level, locType.occlusionHeight);
                } else if (rotation == 1) {
                    Static177.addLocationOccluder(1, locType.occlusionOffset, z, x + 1, level, locType.occlusionHeight);
                    Static177.addLocationOccluder(2, locType.occlusionOffset, z + 1, x, level, locType.occlusionHeight);
                } else if (rotation == 2) {
                    Static177.addLocationOccluder(1, locType.occlusionOffset, z, x + 1, level, locType.occlusionHeight);
                    Static177.addLocationOccluder(2, locType.occlusionOffset, z, x, level, locType.occlusionHeight);
                } else if (rotation == 3) {
                    Static177.addLocationOccluder(1, locType.occlusionOffset, z, x, level, locType.occlusionHeight);
                    Static177.addLocationOccluder(2, locType.occlusionOffset, z, x, level, locType.occlusionHeight);
                }
            }

            if (locType.movementPolicy != 0 && collisionMap != null) {
                collisionMap.flagWall(locType.blockRanged, !locType.routingHint, z, rotation, shape, x);
            }

            if (locType.anInt1243 != 64) {
                Static411.method5666(level, x, z, locType.anInt1243);
            }
        } else if (shape == LocShapes.WALL_SQUARECORNER) {
            @Pc(1079) Wall wall;

            if (isStatic) {
                @Pc(1096) StaticWall staticWall = new StaticWall(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, shape, rotation, local204);

                if (staticWall.castsShadow()) {
                    staticWall.addShadow(toolkit);
                }

                wall = staticWall;
            } else {
                wall = new DynamicWall(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, shape, rotation, animation);
            }

            Static584.method7665(level, x, z, wall, null);

            if (locType.castsShadow && Static404.aBoolean465) {
                if (rotation == 0) {
                    ground.ka(x, z + 1, 50);
                } else if (rotation == 1) {
                    ground.ka(x + 1, z - -1, 50);
                } else if (rotation == 2) {
                    ground.ka(x + 1, z, 50);
                } else if (rotation == 3) {
                    ground.ka(x, z, 50);
                }
            }

            if (locType.movementPolicy != 0 && collisionMap != null) {
                collisionMap.flagWall(locType.blockRanged, !locType.routingHint, z, rotation, shape, x);
            }
        } else if (shape == LocShapes.WALL_DIAGONAL) {
            @Pc(420) PositionEntity loc;

            if (isStatic) {
                @Pc(384) StaticLocation staticLoc = new StaticLocation(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, x, x, z, z, shape, rotation, local204);

                if (staticLoc.castsShadow()) {
                    staticLoc.addShadow(toolkit);
                }

                loc = staticLoc;
            } else {
                loc = new DynamicLocation(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, x, locWidth + x - 1, z, locLength + z - 1, shape, rotation, animation);
            }

            Static102.method2026(loc, false);

            if (locType.locOcclusionMode == 1 && !super.underwater) {
                @Pc(1723) byte occlusionType;
                if ((rotation & 0x1) == 0) {
                    occlusionType = 8;
                } else {
                    occlusionType = 16;
                }

                Static177.addLocationOccluder(occlusionType, 0, z, x, level, locType.occlusionHeight);
            }

            if (locType.movementPolicy != 0 && collisionMap != null) {
                collisionMap.flagRect(x, locLength, z, !locType.routingHint, locWidth, locType.blockRanged);
            }

            if (locType.anInt1243 != 64) {
                Static411.method5666(level, x, z, locType.anInt1243);
            }
        } else if (shape == LocShapes.WALLDECOR_STRAIGHT_NOOFFSET) {
            @Pc(1813) WallDecor decor;

            if (isStatic) {
                @Pc(1801) StaticWallDecor staticDecor = new StaticWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, 0, 0, shape, rotation);

                if (staticDecor.castsShadow()) {
                    staticDecor.addShadow(toolkit);
                }

                decor = staticDecor;
            } else {
                decor = new DynamicWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, 0, 0, shape, rotation, animation);
            }

            Static177.setWallDecor(level, x, z, decor, null);
        } else if (shape == LocShapes.WALLDECOR_STRAIGHT_OFFSET) {
            @Pc(1813) WallDecor decor;

            @Pc(1844) int local1844 = 65;
            @Pc(1850) Location wall = (Location) Static302.getWall(level, x, z);
            if (wall != null) {
                local1844 = Static354.aLocTypeList_4.list(wall.getId()).anInt1243 + 1;
            }

            if (isStatic) {
                @Pc(1916) StaticWallDecor staticDecor = new StaticWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, Static485.anIntArray887[rotation] * local1844, Static609.anIntArray715[rotation] * local1844, shape, rotation);

                if (staticDecor.castsShadow()) {
                    staticDecor.addShadow(toolkit);
                }

                decor = staticDecor;
            } else {
                decor = new DynamicWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, Static485.anIntArray887[rotation] * local1844, local1844 * Static609.anIntArray715[rotation], shape, rotation, animation);
            }

            Static177.setWallDecor(level, x, z, decor, null);
        } else if (shape == LocShapes.WALLDECOR_DIAGONAL_OFFSET) {
            @Pc(1813) WallDecor decor;

            @Pc(1844) int local1844 = 33;
            @Pc(1850) Location wall = (Location) Static302.getWall(level, x, z);
            if (wall != null) {
                local1844 = (Static354.aLocTypeList_4.list(wall.getId()).anInt1243 / 2) + 1;
            }

            if (isStatic) {
                @Pc(1916) StaticWallDecor staticDecor = new StaticWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, Static485.anIntArray887[rotation] * local1844, local1844 * Static609.anIntArray715[rotation], shape, rotation + 4);
                decor = staticDecor;

                if (staticDecor.castsShadow()) {
                    staticDecor.addShadow(toolkit);
                }
            } else {
                decor = new DynamicWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, Static407.anIntArray489[rotation] * local1844, Static636.anIntArray742[rotation] * local1844, shape, rotation + 4, animation);
            }

            Static177.setWallDecor(level, x, z, decor, null);
        } else if (shape == LocShapes.WALLDECOR_DIAGONAL_NOOFFSET) {
            @Pc(1813) WallDecor decor;
            @Pc(1844) int oppositeRotation = (rotation + 2) & 0x3;

            if (isStatic) {
                @Pc(2068) StaticWallDecor staticDecor = new StaticWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, 0, 0, shape, oppositeRotation + 4);
                decor = staticDecor;

                if (staticDecor.castsShadow()) {
                    staticDecor.addShadow(toolkit);
                }
            } else {
                decor = new DynamicWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, 0, 0, shape, oppositeRotation + 4, animation);
            }

            Static177.setWallDecor(level, x, z, decor, null);
        } else if (shape == LocShapes.WALLDECOR_DIAGONAL_BOTH) {
            @Pc(492) int oppositeRotation = rotation + 2 & 0x3;

            @Pc(495) int local495 = 33;
            @Pc(2134) Location wall = (Location) Static302.getWall(level, x, z);
            if (wall != null) {
                local495 = (Static354.aLocTypeList_4.list(wall.getId()).anInt1243 / 2) + 1;
            }

            @Pc(2178) WallDecor primaryDecor;
            @Pc(2200) WallDecor secondaryDecor;
            if (isStatic) {
                primaryDecor = new StaticWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, Static407.anIntArray489[rotation] * local495, Static636.anIntArray742[rotation] * local495, shape, rotation + 4);
                secondaryDecor = new StaticWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, 0, 0, shape, oppositeRotation + 4);

                if (primaryDecor.castsShadow()) {
                    primaryDecor.addShadow(toolkit);
                }

                if (secondaryDecor.castsShadow()) {
                    secondaryDecor.addShadow(toolkit);
                }
            } else {
                primaryDecor = new DynamicWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, Static407.anIntArray489[rotation] * local495, Static636.anIntArray742[rotation] * local495, shape, rotation + 4, animation);
                secondaryDecor = new DynamicWallDecor(toolkit, locType, level, arg7, absX, averageHeight, absZ, super.underwater, 0, 0, shape, oppositeRotation + 4, animation);
            }

            Static177.setWallDecor(level, x, z, primaryDecor, secondaryDecor);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IILclient!ha;ILclient!ge;IIIII)V")
    public void decodeEnvironmentZone(@OriginalArg(0) int x, @OriginalArg(2) Toolkit toolkit, @OriginalArg(3) int pointerZ, @OriginalArg(4) Packet packet, @OriginalArg(5) int level, @OriginalArg(6) int pointerX, @OriginalArg(7) int pointerRotation, @OriginalArg(8) int pointerLevel, @OriginalArg(9) int z) {
        if (super.underwater) {
            return;
        }
        @Pc(10) boolean local10 = false;
        @Pc(12) Environment environment = null;
        @Pc(18) int absX = (pointerX & 0x7) * 8;
        @Pc(24) int absZ = (pointerZ & 0x7) * 8;
        while (true) {
            while (packet.pos < packet.data.length) {
                @Pc(35) int code = packet.g1();

                if (code == 0) {
                    if (environment == null) {
                        environment = new Environment(packet);
                    } else {
                        environment.method8386(packet);
                    }
                } else if (code == 1) {
                    @Pc(63) int count = packet.g1();
                    if (count <= 0) {
                        continue;
                    }

                    for (@Pc(70) int i = 0; i < count; i++) {
                        @Pc(78) EnvironmentLight envLight = new EnvironmentLight(toolkit, packet, 2);
                        if (envLight.preset == 31) {
                            @Pc(91) LightType type = Static48.aClass384_1.list(packet.g2());
                            envLight.updateParameters(type.anInt10374, type.anInt10372, type.anInt10373, type.anInt10377);
                        }

                        if (toolkit.getMaxLights() > 0) {
                            @Pc(108) PointLight light = envLight.light;
                            @Pc(116) int lightX = light.getX() >> 9;
                            @Pc(122) int lightZ = light.getZ() >> 9;

                            if ((pointerLevel == envLight.level) && (lightX >= absX) && (lightX < (absX + 8)) && (lightZ >= absZ) && (lightZ < (absZ + 8))) {
                                @Pc(176) int rx = (x << 9) + rotateLightX(light.getX() & 0xFFF, light.getZ() & 0xFFF, pointerRotation);
                                lightX = rx >> 9;

                                @Pc(200) int rz = (z << 9) + rotateLightZ(light.getZ() & 0xFFF, pointerRotation, light.getX() & 0xFFF);
                                lightZ = rz >> 9;

                                if (lightX >= 0 && lightZ >= 0 && lightX < super.width && lightZ < super.height) {
                                    light.setPosition(rx, rz, super.tileHeights[pointerLevel][lightX][lightZ] - light.getY());
                                    method9122(envLight);
                                }
                            }
                        }
                    }
                } else if (code == 2) {
                    if (environment == null) {
                        environment = new Environment();
                    }
                    environment.decodeBloomParams(packet);
                } else if (code == 128) {
                    if (environment == null) {
                        environment = new Environment();
                    }
                    environment.method8384(packet);
                } else if (code == 129) {
                    if (super.aByteArrayArrayArray12 == null) {
                        super.aByteArrayArrayArray12 = new byte[4][][];
                    }
                    for (@Pc(63) int local63 = 0; local63 < 4; local63++) {
                        @Pc(311) byte local311 = packet.g1b();
                        if (local311 == 0 && super.aByteArrayArrayArray12[level] != null) {
                            if (pointerLevel >= local63) {
                                @Pc(327) int local327 = x;
                                @Pc(331) int local331 = x + 7;
                                @Pc(116) int local116 = z;
                                if (x < 0) {
                                    local327 = 0;
                                } else if (x >= super.width) {
                                    local327 = super.width;
                                }
                                if (local331 < 0) {
                                    local331 = 0;
                                } else if (local331 >= super.width) {
                                    local331 = super.width;
                                }

                                @Pc(122) int local122 = z + 7;
                                if (z < 0) {
                                    local116 = 0;
                                } else if (z >= super.height) {
                                    local116 = super.height;
                                }

                                if (local122 < 0) {
                                    local122 = 0;
                                } else if (super.height <= local122) {
                                    local122 = super.height;
                                }
                                while (local331 > local327) {
                                    while (local122 > local116) {
                                        super.aByteArrayArrayArray12[level][local327][local116] = 0;
                                        local116++;
                                    }
                                    local327++;
                                }
                            }
                        } else if (local311 == 1) {
                            if (super.aByteArrayArrayArray12[level] == null) {
                                super.aByteArrayArrayArray12[level] = new byte[super.width + 1][super.height + 1];
                            }

                            for (@Pc(327) int local327 = 0; local327 < 64; local327 += 4) {
                                for (@Pc(331) int local331 = 0; local331 < 64; local331 += 4) {
                                    @Pc(466) byte local466 = packet.g1b();
                                    if (local63 <= pointerLevel) {
                                        for (@Pc(122) int local122 = local327; local122 < local327 + 4; local122++) {
                                            for (@Pc(176) int local176 = local331; local176 < local331 + 4; local176++) {
                                                if (local122 >= absX && absX + 8 > local122 && local176 >= absZ && absZ + 8 > local176) {
                                                    @Pc(200) int rx = x + rotateZoneX(local122 & 0x7, local176 & 0x7, pointerRotation);
                                                    @Pc(534) int ry = z + rotateZoneY(local176 & 0x7, local122 & 0x7, pointerRotation);
                                                    if (rx >= 0 && rx < super.width && ry >= 0 && ry < super.height) {
                                                        super.aByteArrayArrayArray12[level][rx][ry] = local466;
                                                        local10 = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("");
                }
            }

            if (environment != null) {
                Static108.method2064(z >> 3, x >> 3, environment);
            }

            if (!local10 && super.aByteArrayArrayArray12 != null && super.aByteArrayArrayArray12[level] != null) {
                @Pc(35) int local35 = x + 7;
                @Pc(63) int local63 = z + 7;
                for (@Pc(70) int local70 = x; local70 < local35; local70++) {
                    for (@Pc(327) int local327 = z; local327 < local63; local327++) {
                        super.aByteArrayArrayArray12[level][local70][local327] = 0;
                    }
                }
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(IIIII)Lclient!uv;")
    public Location getLoc(@OriginalArg(0) int x, @OriginalArg(1) int z, @OriginalArg(2) int level, @OriginalArg(3) int layer) {
        @Pc(5) Location location = null;
        if (layer == LocLayer.WALL) {
            location = (Location) Static302.getWall(level, x, z);
        }
        if (layer == LocLayer.WALLDECOR) {
            location = (Location) Static114.getWallDecor(level, x, z);
        }
        if (layer == LocLayer.GROUND) {
            location = (Location) Static578.getEntity(level, x, z, locClass == null ? (locClass = getClass("Location")) : locClass);
        }
        if (layer == LocLayer.GROUNDDECOR) {
            location = (Location) Static687.method8959(level, x, z);
        }
        return location;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I[Lclient!eq;ILclient!ha;BII[BIII)V")
    public void loadChunkLocations(@OriginalArg(0) int regionX, @OriginalArg(1) CollisionMap[] collisionMaps, @OriginalArg(2) int level, @OriginalArg(3) Toolkit toolkit, @OriginalArg(5) int x, @OriginalArg(6) int z, @OriginalArg(7) byte[] data, @OriginalArg(8) int regionRotation, @OriginalArg(9) int regionLevel, @OriginalArg(10) int regionZ) {
        @Pc(26) Packet packet = new Packet(data);
        @Pc(28) int id = -1;
        while (true) {
            @Pc(32) int idOffset = packet.gExtended1or2();
            if (idOffset == 0) {
                return;
            }
            id += idOffset;

            @Pc(40) int coord = 0;
            while (true) {
                @Pc(44) int coordOffset = packet.gsmart();
                if (coordOffset == 0) {
                    break;
                }
                coord += coordOffset - 1;

                @Pc(59) int locZ = coord & 0x3F;
                @Pc(65) int locX = coord >> 6 & 0x3F;
                @Pc(69) int locLevel = coord >> 12;
                @Pc(73) int shapeAndRotation = packet.g1();
                @Pc(77) int locShape = shapeAndRotation >> 2;
                @Pc(81) int locRotation = shapeAndRotation & 0x3;
                if ((locLevel == regionLevel) && (locX >= regionX) && (locX < (regionX + 8)) && (locZ >= regionZ) && (locZ < (regionZ + 8))) {
                    @Pc(113) LocType locType = Static354.aLocTypeList_4.list(id);
                    @Pc(130) int rx = rotateLocX(locType.width, locZ & 0x7, locType.length, locRotation, locX & 0x7, regionRotation) + x;
                    @Pc(147) int rz = rotateLocZ(regionRotation, locZ & 0x7, locType.length, locRotation, locType.width, locX & 0x7) + z;
                    if (rx > 0 && rz > 0 && rx < super.width - 1 && rz < super.height - 1) {
                        @Pc(173) CollisionMap collisionMap = null;
                        if (!super.underwater) {
                            @Pc(178) int actualLevel = level;
                            if ((Static280.tileFlags[1][rx][rz] & TileFlag.BRIDGE) != 0) {
                                actualLevel = level - 1;
                            }
                            if (actualLevel >= 0) {
                                collisionMap = collisionMaps[actualLevel];
                            }
                        }
                        this.loadLocation(locShape, id, collisionMap, rz, toolkit, rx, (regionRotation + locRotation) & 0x3, level, level, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZLclient!ha;B)V")
    public void method7898(@OriginalArg(0) boolean arg0, @OriginalArg(1) Toolkit arg1) {
        Static323.method4624();
        if (!arg0) {
            @Pc(23) int local23;
            @Pc(26) int local26;
            if (super.levels > 1) {
                for (local23 = 0; local23 < super.width; local23++) {
                    for (local26 = 0; super.height > local26; local26++) {
                        if ((Static280.tileFlags[1][local23][local26] & 0x2) == 2) {
                            Static646.method8453(local23, local26);
                        }
                    }
                }
            }
            for (local23 = 0; super.levels > local23; local23++) {
                for (local26 = 0; super.height >= local26; local26++) {
                    for (@Pc(71) int local71 = 0; local71 <= super.width; local71++) {
                        if ((super.occlurerFlags[local23][local71][local26] & 0x4) != 0) {
                            @Pc(88) int local88 = local71;
                            @Pc(90) int local90 = local71;
                            @Pc(92) int local92 = local26;
                            @Pc(94) int local94 = local26;
                            while (local92 > 0 && (super.occlurerFlags[local23][local71][local92 - 1] & 0x4) != 0 && local26 - local92 < 10) {
                                local92--;
                            }
                            while (local94 < super.height && (super.occlurerFlags[local23][local71][local94 + 1] & 0x4) != 0 && local94 - local92 < 10) {
                                local94++;
                            }
                            @Pc(163) int local163;
                            label111:
                            while (local88 > 0 && local71 - local88 < 10) {
                                for (local163 = local92; local163 <= local94; local163++) {
                                    if ((super.occlurerFlags[local23][local88 - 1][local163] & 0x4) == 0) {
                                        break label111;
                                    }
                                }
                                local88--;
                            }
                            label98:
                            while (super.width > local90 && local90 - local88 < 10) {
                                for (local163 = local92; local163 <= local94; local163++) {
                                    if ((super.occlurerFlags[local23][local90 + 1][local163] & 0x4) == 0) {
                                        break label98;
                                    }
                                }
                                local90++;
                            }
                            if ((local90 + 1 - local88) * (local94 + 1 - local92) >= 4) {
                                local163 = super.tileHeights[local23][local88][local92];
                                Static269.method3911((local94 << 9) + 512, local88 << 9, local163, local92 << 9, local163, local23, (local90 << 9) + 512);
                                for (@Pc(297) int local297 = local88; local297 <= local90; local297++) {
                                    for (@Pc(300) int local300 = local92; local300 <= local94; local300++) {
                                        super.occlurerFlags[local23][local297][local300] &= 0xFFFFFFFB;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Static348.method5107();
        }
        super.occlurerFlags = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IBILclient!eq;IILclient!ha;)V")
    public void method7901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) CollisionMap arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Toolkit arg5) {
        @Pc(13) Location local13 = this.getLoc(arg4, arg1, arg3, arg0);
        if (local13 == null) {
            return;
        }
        @Pc(22) LocType local22 = Static354.aLocTypeList_4.list(local13.getId());
        @Pc(26) int local26 = local13.getShape();
        @Pc(30) int local30 = local13.getRotation();
        if (local22.hasSounds()) {
            Static506.method8312(arg4, arg1, arg3, local22);
        }
        if (local13.castsShadow()) {
            local13.removeShadow(arg5, -88);
        }
        if (arg0 == 0) {
            Static26.method717(arg3, arg4, arg1);
            if (local22.movementPolicy != 0) {
                arg2.method2463(arg1, local30, local26, !local22.routingHint, arg4, local22.blockRanged);
            }
            if (local22.locOcclusionMode == 1) {
                if (local30 == 0) {
                    Static687.method8958(arg4, arg3, 1, arg1);
                } else if (local30 == 1) {
                    Static687.method8958(arg4, arg3, 2, arg1 + 1);
                } else if (local30 == 2) {
                    Static687.method8958(arg4 + 1, arg3, 1, arg1);
                } else if (local30 == 3) {
                    Static687.method8958(arg4, arg3, 2, arg1);
                }
            }
        } else if (arg0 == 1) {
            Static173.method2692(arg3, arg4, arg1);
        } else if (arg0 == 2) {
            Static10.method130(arg3, arg4, arg1, locClass == null ? (locClass = getClass("Location")) : locClass);
            if (local22.movementPolicy != 0 && super.width > local22.width + arg4 && super.height > local22.width + arg1 && arg4 + local22.length < super.width && local22.length + arg1 < super.height) {
                arg2.method2468(local22.blockRanged, !local22.routingHint, arg4, local22.width, local22.length, local30, arg1);
            }
            if (local26 == 9) {
                if ((local30 & 0x1) == 0) {
                    Static687.method8958(arg4, arg3, 8, arg1);
                } else {
                    Static687.method8958(arg4, arg3, 16, arg1);
                }
            }
        } else if (arg0 == 3) {
            Static609.method8212(arg3, arg4, arg1);
            if (local22.movementPolicy == 1) {
                arg2.method2473(arg1, arg4);
            }
        }
    }

    static Class getClass(String name) {
        Class instance;
        try {
            instance = Class.forName(name);
        } catch (ClassNotFoundException ex) {
            throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(ex);
        }
        return instance;
    }
}
