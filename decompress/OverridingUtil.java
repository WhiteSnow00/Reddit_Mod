// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import hh2.n0;
import hh2.s;
import hh2.l0;
import java.util.ListIterator;
import java.util.Collections;
import fi2.i;
import fi2.n;
import java.util.HashMap;
import fi2.o;
import kotlin.reflect.jvm.internal.impl.descriptors.c$h;
import hh2.m;
import ti2.v0;
import hh2.c0;
import hh2.j0;
import hh2.a0;
import java.util.LinkedList;
import kotlin.Pair;
import fi2.h;
import ui2.e;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import fi2.j;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import rg2.l;
import fi2.k;
import fi2.g;
import hh2.c;
import java.util.Collection;
import hh2.d0;
import hh2.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import wi2.f;
import kotlin.reflect.jvm.internal.impl.types.a;
import ui.b;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import ui2.d$a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ServiceLoader;
import ti2.t;
import rg2.p;
import ui2.c$a;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import ui2.d;
import java.util.List;

public final class OverridingUtil
{
    public static final List<ExternalOverridabilityCondition> e;
    public static final OverridingUtil f;
    public static final OverridingUtil$a g;
    public final d a;
    public final KotlinTypePreparator b;
    public final c$a c;
    public final p<t, t, Boolean> d;
    
    static {
        e = CollectionsKt___CollectionsKt.q4((Iterable)ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
        f = new OverridingUtil((c$a)(g = new OverridingUtil$a()), d$a.h, KotlinTypePreparator.a.a);
    }
    
    public OverridingUtil(final c$a c, final d$a a, final KotlinTypePreparator.a b) {
        if (c == null) {
            a(5);
            throw null;
        }
        if (a == null) {
            a(6);
            throw null;
        }
        if (b != null) {
            this.c = c;
            this.a = (d)a;
            this.b = b;
            this.d = null;
            return;
        }
        a(7);
        throw null;
    }
    
    public static /* synthetic */ void a(final int n) {
        String s = null;
        Label_0213: {
            Label_0210: {
                if (n != 11 && n != 12 && n != 16 && n != 21 && n != 95 && n != 98 && n != 103 && n != 44 && n != 45) {
                    switch (n) {
                        default: {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    s = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                                    break Label_0213;
                                                }
                                                case 90:
                                                case 91:
                                                case 92: {
                                                    break Label_0210;
                                                }
                                            }
                                            break;
                                        }
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84: {
                                            break Label_0210;
                                        }
                                    }
                                    break;
                                }
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39: {
                                    break Label_0210;
                                }
                            }
                            break;
                        }
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29: {
                            break;
                        }
                    }
                }
            }
            s = "@NotNull method %s.%s must not return null";
        }
        int n2 = 0;
        Label_0427: {
            Label_0425: {
                if (n != 11 && n != 12 && n != 16 && n != 21 && n != 95 && n != 98 && n != 103 && n != 44 && n != 45) {
                    switch (n) {
                        default: {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    n2 = 3;
                                                    break Label_0427;
                                                }
                                                case 90:
                                                case 91:
                                                case 92: {
                                                    break Label_0425;
                                                }
                                            }
                                            break;
                                        }
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84: {
                                            break Label_0425;
                                        }
                                    }
                                    break;
                                }
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39: {
                                    break Label_0425;
                                }
                            }
                            break;
                        }
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29: {
                            break;
                        }
                    }
                }
            }
            n2 = 2;
        }
        final Object[] array = new Object[n2];
        switch (n) {
            default: {
                array[0] = "kotlinTypeRefiner";
                break;
            }
            case 107:
            case 108: {
                array[0] = "memberDescriptor";
                break;
            }
            case 102: {
                array[0] = "onConflict";
                break;
            }
            case 100:
            case 105: {
                array[0] = "extractFrom";
                break;
            }
            case 99:
            case 104: {
                array[0] = "overrider";
                break;
            }
            case 97: {
                array[0] = "toFilter";
                break;
            }
            case 94: {
                array[0] = "classModality";
                break;
            }
            case 79:
            case 101: {
                array[0] = "descriptorByHandle";
                break;
            }
            case 78:
            case 85: {
                array[0] = "overridables";
                break;
            }
            case 76: {
                array[0] = "bReturnType";
                break;
            }
            case 74: {
                array[0] = "aReturnType";
                break;
            }
            case 72:
            case 88:
            case 93:
            case 109: {
                array[0] = "descriptors";
                break;
            }
            case 71: {
                array[0] = "candidate";
                break;
            }
            case 68:
            case 70:
            case 75: {
                array[0] = "b";
                break;
            }
            case 67:
            case 69:
            case 73: {
                array[0] = "a";
                break;
            }
            case 63:
            case 65: {
                array[0] = "notOverridden";
                break;
            }
            case 60: {
                array[0] = "descriptorsFromSuper";
                break;
            }
            case 59: {
                array[0] = "fromCurrent";
                break;
            }
            case 58: {
                array[0] = "fromSuper";
                break;
            }
            case 57: {
                array[0] = "overriding";
                break;
            }
            case 56:
            case 62:
            case 66:
            case 87:
            case 106: {
                array[0] = "strategy";
                break;
            }
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96: {
                array[0] = "current";
                break;
            }
            case 54: {
                array[0] = "membersFromCurrent";
                break;
            }
            case 53: {
                array[0] = "membersFromSupertypes";
                break;
            }
            case 52: {
                array[0] = "name";
                break;
            }
            case 50: {
                array[0] = "subTypeParameter";
                break;
            }
            case 49: {
                array[0] = "superTypeParameter";
                break;
            }
            case 48:
            case 51:
            case 77: {
                array[0] = "typeCheckerState";
                break;
            }
            case 47: {
                array[0] = "typeInSub";
                break;
            }
            case 46: {
                array[0] = "typeInSuper";
                break;
            }
            case 43: {
                array[0] = "secondParameters";
                break;
            }
            case 42: {
                array[0] = "firstParameters";
                break;
            }
            case 20:
            case 23:
            case 31:
            case 41: {
                array[0] = "subDescriptor";
                break;
            }
            case 19:
            case 22:
            case 30:
            case 40: {
                array[0] = "superDescriptor";
                break;
            }
            case 18: {
                array[0] = "result";
                break;
            }
            case 15:
            case 17: {
                array[0] = "descriptor";
                break;
            }
            case 14: {
                array[0] = "g";
                break;
            }
            case 13: {
                array[0] = "f";
                break;
            }
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103: {
                array[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            }
            case 10: {
                array[0] = "transformFirst";
                break;
            }
            case 8:
            case 9: {
                array[0] = "candidateSet";
                break;
            }
            case 5: {
                array[0] = "axioms";
                break;
            }
            case 4: {
                array[0] = "equalityAxioms";
                break;
            }
            case 2: {
                array[0] = "customSubtype";
                break;
            }
            case 1:
            case 7: {
                array[0] = "kotlinTypePreparator";
                break;
            }
        }
        Label_1533: {
            if (n != 11 && n != 12) {
                if (n != 16) {
                    if (n != 21) {
                        if (n == 95) {
                            array[1] = "getMinimalModality";
                            break Label_1533;
                        }
                        if (n == 98) {
                            array[1] = "filterVisibleFakeOverrides";
                            break Label_1533;
                        }
                        if (n == 103) {
                            array[1] = "extractMembersOverridableInBothWays";
                            break Label_1533;
                        }
                        if (n == 44 || n == 45) {
                            array[1] = "createTypeCheckerState";
                            break Label_1533;
                        }
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                switch (n) {
                                                    default: {
                                                        array[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break Label_1533;
                                                    }
                                                    case 90:
                                                    case 91:
                                                    case 92: {
                                                        array[1] = "determineModalityForFakeOverride";
                                                        break Label_1533;
                                                    }
                                                }
                                                break;
                                            }
                                            case 80:
                                            case 81:
                                            case 82:
                                            case 83:
                                            case 84: {
                                                array[1] = "selectMostSpecificMember";
                                                break Label_1533;
                                            }
                                        }
                                        break;
                                    }
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39: {
                                        array[1] = "isOverridableByWithoutExternalConditions";
                                        break Label_1533;
                                    }
                                }
                                break;
                            }
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29: {
                                break;
                            }
                        }
                    }
                    array[1] = "isOverridableBy";
                }
                else {
                    array[1] = "getOverriddenDeclarations";
                }
            }
            else {
                array[1] = "filterOverrides";
            }
        }
        while (true) {
            switch (n) {
                default: {
                    array[2] = "createWithTypeRefiner";
                }
                case 11:
                case 12:
                case 16:
                case 21:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 44:
                case 45:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 90:
                case 91:
                case 92:
                case 95:
                case 98:
                case 103: {
                    final String format = String.format(s, array);
                    Label_2468: {
                        if (n != 11 && n != 12 && n != 16 && n != 21 && n != 95 && n != 98 && n != 103 && n != 44 && n != 45) {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    switch (n) {
                                                        default: {
                                                            throw new IllegalArgumentException(format);
                                                        }
                                                        case 90:
                                                        case 91:
                                                        case 92: {
                                                            break Label_2468;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84: {
                                                    break Label_2468;
                                                }
                                            }
                                            break;
                                        }
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39: {
                                            break Label_2468;
                                        }
                                    }
                                    break;
                                }
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29: {
                                    break;
                                }
                            }
                        }
                    }
                    throw new IllegalStateException(format);
                }
                case 109: {
                    array[2] = "findMaxVisibility";
                    continue;
                }
                case 108: {
                    array[2] = "computeVisibilityToInherit";
                    continue;
                }
                case 107: {
                    array[2] = "resolveUnknownVisibilityForMember";
                    continue;
                }
                case 99:
                case 100:
                case 101:
                case 102:
                case 104:
                case 105:
                case 106: {
                    array[2] = "extractMembersOverridableInBothWays";
                    continue;
                }
                case 96:
                case 97: {
                    array[2] = "filterVisibleFakeOverrides";
                    continue;
                }
                case 93:
                case 94: {
                    array[2] = "getMinimalModality";
                    continue;
                }
                case 88:
                case 89: {
                    array[2] = "determineModalityForFakeOverride";
                    continue;
                }
                case 85:
                case 86:
                case 87: {
                    array[2] = "createAndBindFakeOverride";
                    continue;
                }
                case 78:
                case 79: {
                    array[2] = "selectMostSpecificMember";
                    continue;
                }
                case 73:
                case 74:
                case 75:
                case 76:
                case 77: {
                    array[2] = "isReturnTypeMoreSpecific";
                    continue;
                }
                case 71:
                case 72: {
                    array[2] = "isMoreSpecificThenAllOf";
                    continue;
                }
                case 69:
                case 70: {
                    array[2] = "isVisibilityMoreSpecific";
                    continue;
                }
                case 67:
                case 68: {
                    array[2] = "isMoreSpecific";
                    continue;
                }
                case 64:
                case 65:
                case 66: {
                    array[2] = "createAndBindFakeOverrides";
                    continue;
                }
                case 63: {
                    array[2] = "allHasSameContainingDeclaration";
                    continue;
                }
                case 59:
                case 60:
                case 61:
                case 62: {
                    array[2] = "extractAndBindOverridesForMember";
                    continue;
                }
                case 57:
                case 58: {
                    array[2] = "isVisibleForOverride";
                    continue;
                }
                case 52:
                case 53:
                case 54:
                case 55:
                case 56: {
                    array[2] = "generateOverridesInFunctionGroup";
                    continue;
                }
                case 49:
                case 50:
                case 51: {
                    array[2] = "areTypeParametersEquivalent";
                    continue;
                }
                case 46:
                case 47:
                case 48: {
                    array[2] = "areTypesEquivalent";
                    continue;
                }
                case 42:
                case 43: {
                    array[2] = "createTypeCheckerState";
                    continue;
                }
                case 40:
                case 41: {
                    array[2] = "getBasicOverridabilityProblem";
                    continue;
                }
                case 30:
                case 31: {
                    array[2] = "isOverridableByWithoutExternalConditions";
                    continue;
                }
                case 19:
                case 20:
                case 22:
                case 23: {
                    array[2] = "isOverridableBy";
                    continue;
                }
                case 17:
                case 18: {
                    array[2] = "collectOverriddenDeclarations";
                    continue;
                }
                case 15: {
                    array[2] = "getOverriddenDeclarations";
                    continue;
                }
                case 13:
                case 14: {
                    array[2] = "overrides";
                    continue;
                }
                case 9:
                case 10: {
                    array[2] = "filterOverrides";
                    continue;
                }
                case 8: {
                    array[2] = "filterOutOverridden";
                    continue;
                }
                case 5:
                case 6:
                case 7: {
                    array[2] = "<init>";
                    continue;
                }
                case 3:
                case 4: {
                    array[2] = "create";
                    continue;
                }
                case 1:
                case 2: {
                    array[2] = "createWithTypePreparatorAndCustomSubtype";
                    continue;
                }
            }
            break;
        }
    }
    
    public static boolean b(final t t, final t t2, final TypeCheckerState typeCheckerState) {
        if (t == null) {
            a(46);
            throw null;
        }
        if (t2 != null) {
            return (b.H(t) && b.H(t2)) || a.e(typeCheckerState, (f)t.L0(), (f)t2.L0());
        }
        a(47);
        throw null;
    }
    
    public static void c(final CallableMemberDescriptor callableMemberDescriptor, final LinkedHashSet set) {
        if (callableMemberDescriptor != null) {
            if (callableMemberDescriptor.getKind().isReal()) {
                set.add(callableMemberDescriptor);
            }
            else {
                if (callableMemberDescriptor.e().isEmpty()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No overridden descriptors found for (fake override) ");
                    sb.append(callableMemberDescriptor);
                    throw new IllegalStateException(sb.toString());
                }
                final Iterator iterator = callableMemberDescriptor.e().iterator();
                while (iterator.hasNext()) {
                    c((CallableMemberDescriptor)iterator.next(), set);
                }
            }
            return;
        }
        a(17);
        throw null;
    }
    
    public static ArrayList d(final kotlin.reflect.jvm.internal.impl.descriptors.a a) {
        final d0 f0 = a.f0();
        final ArrayList list = new ArrayList();
        if (f0 != null) {
            list.add(((l0)f0).getType());
        }
        final Iterator iterator = a.g().iterator();
        while (iterator.hasNext()) {
            list.add(((l0)iterator.next()).getType());
        }
        return list;
    }
    
    public static void e(final Collection collection, final c c, final g g) {
        if (collection == null) {
            a(85);
            throw null;
        }
        if (c == null) {
            a(86);
            throw null;
        }
        ArrayList x3 = CollectionsKt___CollectionsKt.x3((Iterable)collection, (l)new k(c));
        final boolean empty = x3.isEmpty();
        if (empty) {
            x3 = (ArrayList)collection;
        }
        final Iterator iterator = x3.iterator();
        final int n = 0;
        int n3;
        int n2 = n3 = 0;
        while (true) {
            while (iterator.hasNext()) {
                final CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor)iterator.next();
                final int n4 = OverridingUtil$b.c[((Enum)((s)callableMemberDescriptor).j()).ordinal()];
                if (n4 != 1) {
                    if (n4 == 2) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Member cannot have SEALED modality: ");
                        sb.append(callableMemberDescriptor);
                        throw new IllegalStateException(sb.toString());
                    }
                    if (n4 != 3) {
                        if (n4 != 4) {
                            continue;
                        }
                        n3 = 1;
                    }
                    else {
                        n2 = 1;
                    }
                }
                else {
                    final Modality modality = Modality.FINAL;
                    if (modality != null) {
                        Object o;
                        if (empty) {
                            o = kotlin.reflect.jvm.internal.impl.descriptors.c.h;
                        }
                        else {
                            o = kotlin.reflect.jvm.internal.impl.descriptors.c.g;
                        }
                        final CallableMemberDescriptor e0 = s(x3, (l<CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a>)new j()).e0((hh2.g)c, modality, (hh2.l)o, CallableMemberDescriptor$Kind.FAKE_OVERRIDE);
                        ((android.support.v4.media.b)g).C0(e0, (Collection)x3);
                        ((android.support.v4.media.b)g).m(e0);
                        return;
                    }
                    a(90);
                    throw null;
                }
            }
            int n5 = n;
            if (((s)c).q0()) {
                n5 = n;
                if (c.j() != Modality.ABSTRACT) {
                    n5 = n;
                    if (c.j() != Modality.SEALED) {
                        n5 = 1;
                    }
                }
            }
            if (n2 != 0 && n3 == 0) {
                final Modality modality = Modality.OPEN;
                if (modality != null) {
                    continue;
                }
                a(91);
                throw null;
            }
            else if (n2 == 0 && n3 != 0) {
                Modality modality;
                if (n5 != 0) {
                    modality = c.j();
                }
                else {
                    modality = Modality.ABSTRACT;
                }
                if (modality != null) {
                    continue;
                }
                a(92);
                throw null;
            }
            else {
                final HashSet set = new HashSet();
                for (final CallableMemberDescriptor callableMemberDescriptor2 : x3) {
                    if (callableMemberDescriptor2 == null) {
                        a(15);
                        throw null;
                    }
                    final LinkedHashSet set2 = new LinkedHashSet();
                    c(callableMemberDescriptor2, set2);
                    set.addAll(set2);
                }
                if (!set.isEmpty()) {
                    final ui2.j j = (ui2.j)DescriptorUtilsKt.j((hh2.g)set.iterator().next()).v(ui2.e.a);
                }
                final h h = new h();
                HashSet set3;
                if (set.size() <= 1) {
                    set3 = set;
                }
                else {
                    set3 = new LinkedHashSet();
                Label_0453:
                    for (final Object next : set) {
                        final Iterator iterator4 = set3.iterator();
                        while (iterator4.hasNext()) {
                            final Pair pair = (Pair)h.invoke(next, iterator4.next());
                            final kotlin.reflect.jvm.internal.impl.descriptors.a a = (kotlin.reflect.jvm.internal.impl.descriptors.a)pair.component1();
                            final kotlin.reflect.jvm.internal.impl.descriptors.a a2 = (kotlin.reflect.jvm.internal.impl.descriptors.a)pair.component2();
                            if (q(a, a2)) {
                                iterator4.remove();
                            }
                            else {
                                if (q(a2, a)) {
                                    continue Label_0453;
                                }
                                continue;
                            }
                        }
                        set3.add(next);
                    }
                }
                final Modality i = c.j();
                if (i == null) {
                    a(94);
                    throw null;
                }
                final Modality abstract1 = Modality.ABSTRACT;
                final Iterator iterator5 = set3.iterator();
                Modality modality = abstract1;
                while (iterator5.hasNext()) {
                    final CallableMemberDescriptor callableMemberDescriptor3 = (CallableMemberDescriptor)iterator5.next();
                    Object k;
                    if (n5 != 0 && ((s)callableMemberDescriptor3).j() == Modality.ABSTRACT) {
                        k = i;
                    }
                    else {
                        k = ((s)callableMemberDescriptor3).j();
                    }
                    if (((Enum)k).compareTo((Enum)modality) < 0) {
                        modality = (Modality)k;
                    }
                }
                if (modality != null) {
                    continue;
                }
                a(95);
                throw null;
            }
            break;
        }
    }
    
    public static ArrayList g(final Object o, final LinkedList list, final l l, final l i) {
        if (o == null) {
            a(99);
            throw null;
        }
        if (l != null) {
            final ArrayList list2 = new ArrayList();
            list2.add(o);
            final kotlin.reflect.jvm.internal.impl.descriptors.a a = l.invoke(o);
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                final kotlin.reflect.jvm.internal.impl.descriptors.a a2 = l.invoke(next);
                if (o == next) {
                    iterator.remove();
                }
                else {
                    final Result j = j(a, a2);
                    if (j == Result.OVERRIDABLE) {
                        list2.add(next);
                        iterator.remove();
                    }
                    else {
                        if (j != Result.CONFLICT) {
                            continue;
                        }
                        i.invoke(next);
                        iterator.remove();
                    }
                }
            }
            return list2;
        }
        a(101);
        throw null;
    }
    
    public static OverrideCompatibilityInfo i(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2) {
        if (a == null) {
            a(40);
            throw null;
        }
        if (a2 != null) {
            final boolean b = a instanceof kotlin.reflect.jvm.internal.impl.descriptors.d;
            if (!b || a2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                final boolean b2 = a instanceof a0;
                if (!b2 || a2 instanceof a0) {
                    if (!b && !b2) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("This type of CallableDescriptor cannot be checked for overridability: ");
                        sb.append(a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if (!((hh2.g)a).getName().equals((Object)((hh2.g)a2).getName())) {
                        return OverrideCompatibilityInfo.d("Name mismatch");
                    }
                    final d0 f0 = a.f0();
                    int n = true ? 1 : 0;
                    final boolean b3 = f0 == null;
                    if (a2.f0() != null) {
                        n = (false ? 1 : 0);
                    }
                    OverrideCompatibilityInfo overrideCompatibilityInfo;
                    if ((b3 ? 1 : 0) != n) {
                        overrideCompatibilityInfo = OverrideCompatibilityInfo.d("Receiver presence mismatch");
                    }
                    else if (a.g().size() != a2.g().size()) {
                        overrideCompatibilityInfo = OverrideCompatibilityInfo.d("Value parameter number mismatch");
                    }
                    else {
                        overrideCompatibilityInfo = null;
                    }
                    if (overrideCompatibilityInfo != null) {
                        return overrideCompatibilityInfo;
                    }
                    return null;
                }
            }
            return OverrideCompatibilityInfo.d("Member kind mismatch");
        }
        a(41);
        throw null;
    }
    
    public static Result j(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2) {
        final OverridingUtil f = OverridingUtil.f;
        final Result c = f.l(a2, a, null).c();
        final Result c2 = f.l(a, a2, null).c();
        Enum<Result> enum1 = Result.OVERRIDABLE;
        if (c != enum1 || c2 != enum1) {
            final Result conflict = Result.CONFLICT;
            if (c != (enum1 = conflict)) {
                if (c2 == conflict) {
                    enum1 = conflict;
                }
                else {
                    enum1 = Result.INCOMPATIBLE;
                }
            }
        }
        return (Result)enum1;
    }
    
    public static boolean k(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2) {
        if (a == null) {
            a(67);
            throw null;
        }
        if (a2 == null) {
            a(68);
            throw null;
        }
        final t returnType = a.getReturnType();
        final t returnType2 = a2.getReturnType();
        final boolean p2 = p((hh2.k)a, (hh2.k)a2);
        final boolean b = false;
        if (!p2) {
            return false;
        }
        final TypeCheckerState f = OverridingUtil.f.f(a.getTypeParameters(), a2.getTypeParameters());
        if (a instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return o(a, returnType, a2, returnType2, f);
        }
        if (!(a instanceof a0)) {
            final StringBuilder r = a.r("Unexpected callable: ");
            r.append(a.getClass());
            throw new IllegalArgumentException(r.toString());
        }
        final a0 a3 = (a0)a;
        final a0 a4 = (a0)a2;
        final c0 setter = a3.getSetter();
        final c0 setter2 = a4.getSetter();
        if (setter != null && setter2 != null && !p((hh2.k)setter, (hh2.k)setter2)) {
            return false;
        }
        if (((n0)a3).B() && ((n0)a4).B()) {
            return a.e(f, (f)returnType.L0(), (f)returnType2.L0());
        }
        if (!((n0)a3).B()) {
            final boolean b2 = b;
            if (((n0)a4).B()) {
                return b2;
            }
        }
        boolean b2 = b;
        if (o(a, returnType, a2, returnType2, f)) {
            b2 = true;
        }
        return b2;
    }
    
    public static boolean o(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final t t, final kotlin.reflect.jvm.internal.impl.descriptors.a a2, final t t2, final TypeCheckerState typeCheckerState) {
        if (a == null) {
            a(73);
            throw null;
        }
        if (t == null) {
            a(74);
            throw null;
        }
        if (a2 == null) {
            a(75);
            throw null;
        }
        if (t2 != null) {
            final a a3 = a.a;
            final v0 l0 = t.L0();
            final v0 l2 = t2.L0();
            sg2.e.f((Object)l0, "subType");
            sg2.e.f((Object)l2, "superType");
            return a.i(a3, typeCheckerState, (f)l0, (f)l2);
        }
        a(76);
        throw null;
    }
    
    public static boolean p(final hh2.k k, final hh2.k i) {
        if (k == null) {
            a(69);
            throw null;
        }
        if (i != null) {
            final Integer b = kotlin.reflect.jvm.internal.impl.descriptors.c.b(k.getVisibility(), i.getVisibility());
            return b == null || b >= 0;
        }
        a(70);
        throw null;
    }
    
    public static boolean q(final kotlin.reflect.jvm.internal.impl.descriptors.a a, kotlin.reflect.jvm.internal.impl.descriptors.a a2) {
        if (a == null) {
            a(13);
            throw null;
        }
        if (a2 == null) {
            a(14);
            throw null;
        }
        if (!a.equals(a2) && a.a.a((hh2.g)a.a(), (hh2.g)a2.a(), false, true)) {
            return true;
        }
        a2 = a2.a();
        final int a3 = fi2.d.a;
        final LinkedHashSet set = new LinkedHashSet();
        fi2.d.b(a.a(), set);
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if (a.a.a((hh2.g)a2, (hh2.g)iterator.next(), false, true)) {
                return true;
            }
        }
        return false;
    }
    
    public static void r(final CallableMemberDescriptor callableMemberDescriptor, final l<CallableMemberDescriptor, hg2.j> l) {
        if (callableMemberDescriptor == null) {
            a(107);
            throw null;
        }
        for (final CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.e()) {
            if (((s)callableMemberDescriptor2).getVisibility() == kotlin.reflect.jvm.internal.impl.descriptors.c.g) {
                r(callableMemberDescriptor2, l);
            }
        }
        if (((s)callableMemberDescriptor).getVisibility() != kotlin.reflect.jvm.internal.impl.descriptors.c.g) {
            return;
        }
        final Collection e = callableMemberDescriptor.e();
        if (e != null) {
            c$h i = null;
            Label_0234: {
                if (e.isEmpty()) {
                    i = kotlin.reflect.jvm.internal.impl.descriptors.c.l;
                }
                else {
                    final Iterator iterator2 = e.iterator();
                    Object o = null;
                Label_0107:
                    while (true) {
                        o = null;
                        while (iterator2.hasNext()) {
                            final m visibility = ((s)iterator2.next()).getVisibility();
                            if (o != null) {
                                final Integer b = kotlin.reflect.jvm.internal.impl.descriptors.c.b(visibility, (m)o);
                                if (b == null) {
                                    continue Label_0107;
                                }
                                if (b <= 0) {
                                    continue;
                                }
                            }
                            o = visibility;
                        }
                        break;
                    }
                    Label_0227: {
                        if (o != null) {
                            final Iterator iterator3 = e.iterator();
                            while (iterator3.hasNext()) {
                                final Integer b2 = kotlin.reflect.jvm.internal.impl.descriptors.c.b((m)o, ((s)iterator3.next()).getVisibility());
                                if (b2 == null || b2 < 0) {
                                    break Label_0227;
                                }
                            }
                            i = (c$h)o;
                            break Label_0234;
                        }
                    }
                    i = null;
                }
            }
            Object d = null;
            Label_0320: {
                if (i != null) {
                    if (callableMemberDescriptor.getKind() != CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
                        d = ((m)i).d();
                        break Label_0320;
                    }
                    final Iterator iterator4 = e.iterator();
                    CallableMemberDescriptor callableMemberDescriptor3;
                    do {
                        d = i;
                        if (!iterator4.hasNext()) {
                            break Label_0320;
                        }
                        callableMemberDescriptor3 = (CallableMemberDescriptor)iterator4.next();
                    } while (((s)callableMemberDescriptor3).j() == Modality.ABSTRACT || ((s)callableMemberDescriptor3).getVisibility().equals(i));
                }
                d = null;
            }
            Object e2;
            if (d == null) {
                if (l != null) {
                    l.invoke(callableMemberDescriptor);
                }
                e2 = kotlin.reflect.jvm.internal.impl.descriptors.c.e;
            }
            else {
                e2 = d;
            }
            if (callableMemberDescriptor instanceof kh2.d0) {
                final kh2.d0 d2 = (kh2.d0)callableMemberDescriptor;
                if (e2 == null) {
                    kh2.d0.F(20);
                    throw null;
                }
                d2.o = (m)e2;
                for (final kotlin.reflect.jvm.internal.impl.descriptors.e e3 : ((a0)callableMemberDescriptor).u()) {
                    l<CallableMemberDescriptor, hg2.j> j;
                    if (d == null) {
                        j = null;
                    }
                    else {
                        j = l;
                    }
                    r((CallableMemberDescriptor)e3, j);
                }
            }
            else if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.b) {
                final kotlin.reflect.jvm.internal.impl.descriptors.impl.b b3 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.b)callableMemberDescriptor;
                if (e2 == null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.b.F(10);
                    throw null;
                }
                b3.q = (m)e2;
            }
            else {
                final kh2.c0 c0 = (kh2.c0)callableMemberDescriptor;
                if ((c0.p = (m)e2) != ((s)c0.h0()).getVisibility()) {
                    c0.j = false;
                }
            }
            return;
        }
        a(109);
        throw null;
    }
    
    public static <H> H s(final Collection<H> collection, final l<H, kotlin.reflect.jvm.internal.impl.descriptors.a> l) {
        if (l == null) {
            a(79);
            throw null;
        }
        if (collection.size() != 0) {
            final Object z3 = CollectionsKt___CollectionsKt.z3((Iterable)collection);
            if (z3 != null) {
                return (H)z3;
            }
            a(80);
            throw null;
        }
        else {
            final ArrayList list = new ArrayList(2);
            final ArrayList list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.a>(ig2.m.c3((Iterable)collection, 10));
            final Iterator<Object> iterator = collection.iterator();
            while (iterator.hasNext()) {
                list2.add(l.invoke(iterator.next()));
            }
            final Object z4 = CollectionsKt___CollectionsKt.z3((Iterable)collection);
            final kotlin.reflect.jvm.internal.impl.descriptors.a a = l.invoke((H)z4);
            final Iterator iterator2 = collection.iterator();
            H h = (H)z4;
        Label_0124:
            while (iterator2.hasNext()) {
                final Object next = iterator2.next();
                final kotlin.reflect.jvm.internal.impl.descriptors.a a2 = l.invoke((H)next);
                if (a2 != null) {
                    final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.a> iterator3 = list2.iterator();
                    while (true) {
                        while (iterator3.hasNext()) {
                            if (!k(a2, iterator3.next())) {
                                final boolean b = false;
                                if (b) {
                                    list.add(next);
                                }
                                if (k(a2, a) && !k(a, a2)) {
                                    h = (H)next;
                                    continue Label_0124;
                                }
                                continue Label_0124;
                            }
                        }
                        final boolean b = true;
                        continue;
                    }
                }
                a(71);
                throw null;
            }
            if (list.isEmpty()) {
                if (h != null) {
                    return h;
                }
                a(81);
                throw null;
            }
            else {
                if (list.size() != 1) {
                    while (true) {
                        for (final Object next2 : list) {
                            if (!a4.a0.i0(l.invoke((H)next2).getReturnType())) {
                                if (next2 != null) {
                                    return (H)next2;
                                }
                                final Object z5 = CollectionsKt___CollectionsKt.z3((Iterable)list);
                                if (z5 != null) {
                                    return (H)z5;
                                }
                                a(84);
                                throw null;
                            }
                        }
                        Object next2 = null;
                        continue;
                    }
                }
                final Object z6 = CollectionsKt___CollectionsKt.z3((Iterable)list);
                if (z6 != null) {
                    return (H)z6;
                }
                a(82);
                throw null;
            }
        }
    }
    
    public final TypeCheckerState f(final List<j0> list, final List<j0> list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        if (list.isEmpty()) {
            final o o = new o((HashMap)null, this.c, this.a, this.b, (p)this.d);
            Object o2;
            if (o.j == null) {
                final d h = o.h;
                final KotlinTypePreparator i = o.i;
                sg2.e.f((Object)i, "kotlinTypePreparator");
                sg2.e.f((Object)h, "kotlinTypeRefiner");
                o2 = new TypeCheckerState(true, true, (wi2.l)o, (android.support.v4.media.c)i, h);
            }
            else {
                o2 = new n(o, o.i, o.h);
            }
            return (TypeCheckerState)o2;
        }
        final HashMap hashMap = new HashMap();
        for (int j = 0; j < list.size(); ++j) {
            hashMap.put(((j0)list.get(j)).m(), list2.get(j).m());
        }
        final o o3 = new o(hashMap, this.c, this.a, this.b, (p)this.d);
        Object o4;
        if (o3.j == null) {
            final d h2 = o3.h;
            final KotlinTypePreparator k = o3.i;
            sg2.e.f((Object)k, "kotlinTypePreparator");
            sg2.e.f((Object)h2, "kotlinTypeRefiner");
            o4 = new TypeCheckerState(true, true, (wi2.l)o3, (android.support.v4.media.c)k, h2);
        }
        else {
            o4 = new n(o3, o3.i, o3.h);
        }
        return (TypeCheckerState)o4;
    }
    
    public final void h(final di2.e e, final Collection collection, final Collection collection2, final c c, final g g) {
        if (e == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (c == null) {
            a(55);
            throw null;
        }
        final LinkedHashSet set = new LinkedHashSet(collection);
        final Iterator iterator = collection2.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final boolean b = true;
            if (!hasNext) {
                int n = 0;
                Label_0387: {
                    if (set.size() < 2) {
                        n = (b ? 1 : 0);
                    }
                    else {
                        final i i = new i(((hh2.h)set.iterator().next()).b());
                        if (set.isEmpty()) {
                            n = (b ? 1 : 0);
                        }
                        else {
                            final Iterator iterator2 = set.iterator();
                            do {
                                n = (b ? 1 : 0);
                                if (iterator2.hasNext()) {
                                    continue;
                                }
                                break Label_0387;
                            } while (i.invoke(iterator2.next()));
                            n = 0;
                        }
                    }
                }
                if (n != 0) {
                    final Iterator iterator3 = set.iterator();
                    while (iterator3.hasNext()) {
                        e(Collections.singleton(iterator3.next()), c, g);
                    }
                }
                else {
                    final LinkedList list = new LinkedList(set);
                    while (!list.isEmpty()) {
                        list.isEmpty();
                        final Iterator iterator4 = list.iterator();
                        Object o = null;
                        while (iterator4.hasNext()) {
                            final CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor)iterator4.next();
                            if (o != null) {
                                final Integer b2 = kotlin.reflect.jvm.internal.impl.descriptors.c.b(((s)o).getVisibility(), ((s)callableMemberDescriptor).getVisibility());
                                if (b2 == null || b2 >= 0) {
                                    continue;
                                }
                            }
                            o = callableMemberDescriptor;
                        }
                        sg2.e.c(o);
                        e(g(o, list, (l)new fi2.l(), (l)new fi2.m(g, (CallableMemberDescriptor)o)), c, g);
                    }
                }
                return;
            }
            final CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor)iterator.next();
            if (callableMemberDescriptor2 == null) {
                a(59);
                throw null;
            }
            final ArrayList<CallableMemberDescriptor> list2 = new ArrayList<CallableMemberDescriptor>(collection.size());
            final zi2.d d = new zi2.d();
            for (final CallableMemberDescriptor callableMemberDescriptor3 : collection) {
                final Result c2 = this.l((kotlin.reflect.jvm.internal.impl.descriptors.a)callableMemberDescriptor3, (kotlin.reflect.jvm.internal.impl.descriptors.a)callableMemberDescriptor2, c).c();
                final boolean b3 = !kotlin.reflect.jvm.internal.impl.descriptors.c.e(((s)callableMemberDescriptor3).getVisibility()) && kotlin.reflect.jvm.internal.impl.descriptors.c.c(kotlin.reflect.jvm.internal.impl.descriptors.c.n, (hh2.k)callableMemberDescriptor3, (hh2.g)callableMemberDescriptor2) == null;
                final int n2 = OverridingUtil$b.b[c2.ordinal()];
                if (n2 != 1) {
                    if (n2 != 2) {
                        continue;
                    }
                    if (b3) {
                        g.c1(callableMemberDescriptor3, callableMemberDescriptor2);
                    }
                    list2.add(callableMemberDescriptor3);
                }
                else {
                    if (b3) {
                        d.add((Object)callableMemberDescriptor3);
                    }
                    list2.add(callableMemberDescriptor3);
                }
            }
            ((android.support.v4.media.b)g).C0(callableMemberDescriptor2, (Collection)d);
            set.removeAll(list2);
        }
    }
    
    public final OverrideCompatibilityInfo l(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2, final c c) {
        if (a == null) {
            a(19);
            throw null;
        }
        if (a2 == null) {
            a(20);
            throw null;
        }
        final OverrideCompatibilityInfo m = this.m(a, a2, c, false);
        if (m != null) {
            return m;
        }
        a(21);
        throw null;
    }
    
    public final OverrideCompatibilityInfo m(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2, final c c, final boolean b) {
        if (a == null) {
            a(22);
            throw null;
        }
        if (a2 == null) {
            a(23);
            throw null;
        }
        final OverrideCompatibilityInfo n = this.n(a, a2, b);
        int n2;
        if (n.c() == Result.OVERRIDABLE) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        for (final ExternalOverridabilityCondition externalOverridabilityCondition : OverridingUtil.e) {
            if (externalOverridabilityCondition.b() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                continue;
            }
            if (n2 != 0 && externalOverridabilityCondition.b() == ExternalOverridabilityCondition.Contract.SUCCESS_ONLY) {
                continue;
            }
            final int n3 = OverridingUtil$b.a[externalOverridabilityCondition.a(a, a2, c).ordinal()];
            if (n3 != 1) {
                if (n3 == 2) {
                    return OverrideCompatibilityInfo.b("External condition failed");
                }
                if (n3 != 3) {
                    continue;
                }
                return OverrideCompatibilityInfo.d("External condition");
            }
            else {
                n2 = 1;
            }
        }
        if (n2 == 0) {
            return n;
        }
        for (final ExternalOverridabilityCondition externalOverridabilityCondition2 : OverridingUtil.e) {
            if (externalOverridabilityCondition2.b() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                continue;
            }
            final int n4 = OverridingUtil$b.a[externalOverridabilityCondition2.a(a, a2, c).ordinal()];
            if (n4 == 1) {
                final StringBuilder r = a.r("Contract violation in ");
                r.append(externalOverridabilityCondition2.getClass().getName());
                r.append(" condition. It's not supposed to end with success");
                throw new IllegalStateException(r.toString());
            }
            if (n4 == 2) {
                return OverrideCompatibilityInfo.b("External condition failed");
            }
            if (n4 != 3) {
                continue;
            }
            return OverrideCompatibilityInfo.d("External condition");
        }
        final OverrideCompatibilityInfo b2 = OverrideCompatibilityInfo.b;
        if (b2 != null) {
            return b2;
        }
        OverrideCompatibilityInfo.a(0);
        throw null;
    }
    
    public final OverrideCompatibilityInfo n(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2, final boolean b) {
        if (a == null) {
            a(30);
            throw null;
        }
        if (a2 == null) {
            a(31);
            throw null;
        }
        final OverrideCompatibilityInfo i = i(a, a2);
        if (i != null) {
            return i;
        }
        final ArrayList d = d(a);
        final ArrayList d2 = d(a2);
        final List typeParameters = a.getTypeParameters();
        final List typeParameters2 = a2.getTypeParameters();
        final int size = typeParameters.size();
        final int size2 = typeParameters2.size();
        int j = 0;
        if (size != size2) {
            while (j < d.size()) {
                if (!ui2.c.a.b((t)d.get(j), (t)d2.get(j))) {
                    return OverrideCompatibilityInfo.d("Type parameter number mismatch");
                }
                ++j;
            }
            return OverrideCompatibilityInfo.b("Type parameter number mismatch");
        }
        final TypeCheckerState f = this.f(typeParameters, typeParameters2);
        for (int k = 0; k < typeParameters.size(); ++k) {
            final j0 j2 = typeParameters.get(k);
            final j0 j3 = typeParameters2.get(k);
            if (j2 == null) {
                a(49);
                throw null;
            }
            if (j3 == null) {
                a(50);
                throw null;
            }
            final List upperBounds = j2.getUpperBounds();
            final ArrayList list = new ArrayList(j3.getUpperBounds());
            boolean b2 = false;
            Label_0331: {
                Label_0322: {
                    if (upperBounds.size() == list.size()) {
                    Label_0253:
                        for (final t t : upperBounds) {
                            final ListIterator listIterator = list.listIterator();
                            while (listIterator.hasNext()) {
                                if (b(t, (t)listIterator.next(), f)) {
                                    listIterator.remove();
                                    continue Label_0253;
                                }
                            }
                            break Label_0322;
                        }
                        b2 = true;
                        break Label_0331;
                    }
                }
                b2 = false;
            }
            if (!b2) {
                return OverrideCompatibilityInfo.d("Type parameter bounds mismatch");
            }
        }
        for (int l = 0; l < d.size(); ++l) {
            if (!b((t)d.get(l), (t)d2.get(l), f)) {
                return OverrideCompatibilityInfo.d("Value parameter type mismatch");
            }
        }
        if (a instanceof kotlin.reflect.jvm.internal.impl.descriptors.d && a2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d && ((kotlin.reflect.jvm.internal.impl.descriptors.d)a).isSuspend() != ((kotlin.reflect.jvm.internal.impl.descriptors.d)a2).isSuspend()) {
            return OverrideCompatibilityInfo.b("Incompatible suspendability");
        }
        if (b) {
            final t returnType = a.getReturnType();
            final t returnType2 = a2.getReturnType();
            if (returnType != null && returnType2 != null && (!b.H(returnType2) || !b.H(returnType))) {
                final a a3 = a.a;
                final v0 l2 = returnType2.L0();
                final v0 l3 = returnType.L0();
                sg2.e.f((Object)l2, "subType");
                sg2.e.f((Object)l3, "superType");
                if (!a.i(a3, f, (f)l2, (f)l3)) {
                    return OverrideCompatibilityInfo.b("Return type mismatch");
                }
            }
        }
        final OverrideCompatibilityInfo b3 = OverrideCompatibilityInfo.b;
        if (b3 != null) {
            return b3;
        }
        OverrideCompatibilityInfo.a(0);
        throw null;
    }
    
    public static final class OverrideCompatibilityInfo
    {
        public static final OverrideCompatibilityInfo b;
        public final Result a;
        
        static {
            b = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");
        }
        
        public OverrideCompatibilityInfo(final Result a, final String s) {
            if (a != null) {
                this.a = a;
                return;
            }
            a(3);
            throw null;
        }
        
        public static /* synthetic */ void a(final int n) {
            String s;
            if (n != 1 && n != 2 && n != 3 && n != 4) {
                s = "@NotNull method %s.%s must not return null";
            }
            else {
                s = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            int n2;
            if (n != 1 && n != 2 && n != 3 && n != 4) {
                n2 = 2;
            }
            else {
                n2 = 3;
            }
            final Object[] array = new Object[n2];
            Label_0102: {
                if (n != 1 && n != 2) {
                    if (n == 3) {
                        array[0] = "success";
                        break Label_0102;
                    }
                    if (n != 4) {
                        array[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                        break Label_0102;
                    }
                }
                array[0] = "debugMessage";
            }
            switch (n) {
                default: {
                    array[1] = "success";
                    break;
                }
                case 6: {
                    array[1] = "getDebugMessage";
                    break;
                }
                case 5: {
                    array[1] = "getResult";
                    break;
                }
                case 1:
                case 2:
                case 3:
                case 4: {
                    array[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                }
            }
            if (n != 1) {
                if (n != 2) {
                    if (n == 3 || n == 4) {
                        array[2] = "<init>";
                    }
                }
                else {
                    array[2] = "conflict";
                }
            }
            else {
                array[2] = "incompatible";
            }
            final String format = String.format(s, array);
            RuntimeException ex;
            if (n != 1 && n != 2 && n != 3 && n != 4) {
                ex = new IllegalStateException(format);
            }
            else {
                ex = new IllegalArgumentException(format);
            }
            throw ex;
        }
        
        public static OverrideCompatibilityInfo b(final String s) {
            return new OverrideCompatibilityInfo(Result.CONFLICT, s);
        }
        
        public static OverrideCompatibilityInfo d(final String s) {
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, s);
        }
        
        public final Result c() {
            final Result a = this.a;
            if (a != null) {
                return a;
            }
            a(5);
            throw null;
        }
        
        public enum Result
        {
            CONFLICT, 
            INCOMPATIBLE, 
            OVERRIDABLE;
        }
    }
}
