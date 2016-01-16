package com.jagex;

import java.lang.*;

public final class Npc extends Character {

    static Sprite[] hitmarks;
    static classAp fieldNk;
    NpcDefinition definition;

    @Override
    protected final Model getModel(int var1) {
        try {
            if (this.definition == null) {
                if (var1 >= -1519654467) {
                    throw new IllegalStateException();
                } else {
                    return null;
                }
            } else {
                AnimationSequence var10000;
                label89:
                {
                    if (-1 != this.animation * -433706235) {
                        if (var1 >= -1519654467) {
                            throw new IllegalStateException();
                        }

                        if (0 == this.animationDelay * -1858896077) {
                            var10000 = AnimationSequence.get(this.animation * -433706235, 1571027478);
                            break label89;
                        }
                    }

                    var10000 = null;
                }

                AnimationSequence var2;
                label83:
                {
                    var2 = var10000;
                    if (-1 != this.fieldAc * -1420731557) {
                        label94:
                        {
                            if (var1 >= -1519654467) {
                                throw new IllegalStateException();
                            }

                            if (this.fieldAc * -1420731557 == this.fieldC * -1367515705) {
                                if (var1 >= -1519654467) {
                                    throw new IllegalStateException();
                                }

                                if (var2 != null) {
                                    break label94;
                                }

                                if (var1 >= -1519654467) {
                                    throw new IllegalStateException();
                                }
                            }

                            var10000 = AnimationSequence.get(this.fieldAc * -1420731557, 2045468708);
                            break label83;
                        }
                    }

                    var10000 = null;
                }

                AnimationSequence var3 = var10000;
                Model var4 = this.definition.m(var2, this.fieldBo * 1983896939, var3, this.fieldAp * 816706191, 2091895202);
                if (null == var4) {
                    if (var1 >= -1519654467) {
                        throw new IllegalStateException();
                    } else {
                        return null;
                    }
                } else {
                    var4.m();
                    this.fieldBn = var4.modelHeight * 45054333;
                    if (-1 != this.fieldBp * -1404237317) {
                        if (var1 >= -1519654467) {
                            throw new IllegalStateException();
                        }

                        if (this.fieldBw * -2049894135 != -1) {
                            if (var1 >= -1519654467) {
                                throw new IllegalStateException();
                            }

                            Model var5 = TilePaint.getAnimation(this.fieldBp * -1404237317, -1697062403).l(this.fieldBw * -2049894135, 793976943);
                            if (null != var5) {
                                if (var1 >= -1519654467) {
                                    throw new IllegalStateException();
                                }

                                var5.translate(0, -(this.fieldBr * -634107447), 0);
                                Model[] var6 = new Model[]{var4, var5};
                                var4 = new Model(var6, 2);
                            }
                        }
                    }

                    if (1 == -450177113 * this.definition.fieldW) {
                        var4.fieldAn = true;
                    }

                    return var4;
                }
            }
        } catch (RuntimeException var7) {
            throw ClanMate.error(var7, "ae.v(" + ')');
        }
    }

    @Override
    final boolean isValid(int var1) {
        try {
            return this.definition != null;
        } catch (RuntimeException var2) {
            throw ClanMate.error(var2, "ae.i(" + ')');
        }
    }
}
