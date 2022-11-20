// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.text;

import mg2.p;
import wi2.n;
import cg.d;
import java.util.ArrayList;
import java.util.Collections;
import dg2.o;
import java.util.EnumSet;
import mg2.l;
import mg2.a;
import wi2.i;
import java.util.regex.Matcher;
import java.util.List;
import wi2.k;
import java.util.Iterator;
import xi2.c;
import ng2.e;
import java.util.regex.Pattern;
import java.util.Set;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = {}, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 32\u00060\u0001j\u0002`\u0002:\u000245B\u0011\b\u0001\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b-\u0010.B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020\u0014¢\u0006\u0004\b-\u0010/B\u0019\b\u0016\u0012\u0006\u0010)\u001a\u00020\u0014\u0012\u0006\u00100\u001a\u00020$¢\u0006\u0004\b-\u00101B\u001f\b\u0016\u0012\u0006\u0010)\u001a\u00020\u0014\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b-\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\"\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0017J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\nJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0007J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0006\u0010 \u001a\u00020\u001fR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020$0#8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00066" }, d2 = { "Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "input", "", "matches", "containsMatchIn", "", "startIndex", "Lxi2/e;", "find", "Lwi2/k;", "findAll", "matchEntire", "index", "matchAt", "matchesAt", "", "replacement", "replace", "Lkotlin/Function1;", "transform", "replaceFirst", "limit", "", "split", "splitToSequence", "toString", "Ljava/util/regex/Pattern;", "toPattern", "nativePattern", "Ljava/util/regex/Pattern;", "", "Lkotlin/text/RegexOption;", "_options", "Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "pattern", "getOptions", "()Ljava/util/Set;", "options", "<init>", "(Ljava/util/regex/Pattern;)V", "(Ljava/lang/String;)V", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "(Ljava/lang/String;Ljava/util/Set;)V", "Companion", "a", "Serialized", "kotlin-stdlib" }, k = 1, mv = { 1, 7, 1 })
public final class Regex implements Serializable
{
    public static final a Companion;
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;
    
    static {
        Companion = new a();
    }
    
    public Regex(final String s) {
        e.f((Object)s, "pattern");
        final Pattern compile = Pattern.compile(s);
        e.e((Object)compile, "compile(pattern)");
        this(compile);
    }
    
    public Regex(final String s, final Set<? extends RegexOption> set) {
        e.f((Object)s, "pattern");
        e.f((Object)set, "options");
        final a companion = Regex.Companion;
        final Iterator<c> iterator = set.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n |= iterator.next().getValue();
        }
        companion.getClass();
        int n2 = n;
        if ((n & 0x2) != 0x0) {
            n2 = (n | 0x40);
        }
        final Pattern compile = Pattern.compile(s, n2);
        e.e((Object)compile, "compile(pattern, ensureU\u2026odeCase(options.toInt()))");
        this(compile);
    }
    
    public Regex(final String s, final RegexOption regexOption) {
        e.f((Object)s, "pattern");
        e.f((Object)regexOption, "option");
        final a companion = Regex.Companion;
        final int value = regexOption.getValue();
        companion.getClass();
        int n = value;
        if ((value & 0x2) != 0x0) {
            n = (value | 0x40);
        }
        final Pattern compile = Pattern.compile(s, n);
        e.e((Object)compile, "compile(pattern, ensureUnicodeCase(option.value))");
        this(compile);
    }
    
    public Regex(final Pattern nativePattern) {
        e.f((Object)nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }
    
    public static final Pattern access$getNativePattern$p(final Regex regex) {
        return regex.nativePattern;
    }
    
    public static xi2.e find$default(final Regex regex, final CharSequence charSequence, int n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        return regex.find(charSequence, n);
    }
    
    public static k findAll$default(final Regex regex, final CharSequence charSequence, int n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        return regex.findAll(charSequence, n);
    }
    
    public static List split$default(final Regex regex, final CharSequence charSequence, int n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        return regex.split(charSequence, n);
    }
    
    public static k splitToSequence$default(final Regex regex, final CharSequence charSequence, int n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        return regex.splitToSequence(charSequence, n);
    }
    
    private final Object writeReplace() {
        final String pattern = this.nativePattern.pattern();
        e.e((Object)pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.nativePattern.flags());
    }
    
    public final boolean containsMatchIn(final CharSequence charSequence) {
        e.f((Object)charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }
    
    public final xi2.e find(final CharSequence charSequence, final int n) {
        e.f((Object)charSequence, "input");
        final Matcher matcher = this.nativePattern.matcher(charSequence);
        e.e((Object)matcher, "nativePattern.matcher(input)");
        Object o;
        if (!matcher.find(n)) {
            o = null;
        }
        else {
            o = new MatcherMatchResult(matcher, charSequence);
        }
        return (xi2.e)o;
    }
    
    public final k<xi2.e> findAll(final CharSequence charSequence, final int n) {
        e.f((Object)charSequence, "input");
        if (n >= 0 && n <= charSequence.length()) {
            final Regex$findAll$1 regex$findAll$1 = new Regex$findAll$1(this, charSequence, n);
            final Regex$findAll$2 instance = Regex$findAll$2.INSTANCE;
            e.f((Object)instance, "nextFunction");
            return (k<xi2.e>)new i((mg2.a)regex$findAll$1, (l)instance);
        }
        final StringBuilder o = android.support.v4.media.a.o("Start index out of bounds: ", n, ", input length: ");
        o.append(charSequence.length());
        throw new IndexOutOfBoundsException(o.toString());
    }
    
    public final Set<RegexOption> getOptions() {
        Object options;
        if ((options = this._options) == null) {
            final int flags = this.nativePattern.flags();
            final EnumSet<RegexOption> all = EnumSet.allOf(RegexOption.class);
            e.e((Object)all, "");
            o.C4((Iterable)all, (l)new Regex$special$$inlined$fromInt$1(flags), false);
            options = Collections.unmodifiableSet((Set<?>)all);
            e.e(options, "unmodifiableSet(EnumSet.\u2026mask == it.value }\n    })");
            this._options = (Set<? extends RegexOption>)options;
        }
        return (Set<RegexOption>)options;
    }
    
    public final String getPattern() {
        final String pattern = this.nativePattern.pattern();
        e.e((Object)pattern, "nativePattern.pattern()");
        return pattern;
    }
    
    public final xi2.e matchAt(final CharSequence charSequence, final int n) {
        e.f((Object)charSequence, "input");
        final Matcher region = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(n, charSequence.length());
        Object o;
        if (region.lookingAt()) {
            o = new MatcherMatchResult(region, charSequence);
        }
        else {
            o = null;
        }
        return (xi2.e)o;
    }
    
    public final xi2.e matchEntire(final CharSequence charSequence) {
        e.f((Object)charSequence, "input");
        final Matcher matcher = this.nativePattern.matcher(charSequence);
        e.e((Object)matcher, "nativePattern.matcher(input)");
        Object o;
        if (!matcher.matches()) {
            o = null;
        }
        else {
            o = new MatcherMatchResult(matcher, charSequence);
        }
        return (xi2.e)o;
    }
    
    public final boolean matches(final CharSequence charSequence) {
        e.f((Object)charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }
    
    public final boolean matchesAt(final CharSequence charSequence, final int n) {
        e.f((Object)charSequence, "input");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(n, charSequence.length()).lookingAt();
    }
    
    public final String replace(final CharSequence charSequence, final String s) {
        e.f((Object)charSequence, "input");
        e.f((Object)s, "replacement");
        final String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(s);
        e.e((Object)replaceAll, "nativePattern.matcher(in\u2026).replaceAll(replacement)");
        return replaceAll;
    }
    
    public final String replace(final CharSequence charSequence, final l<? super xi2.e, ? extends CharSequence> l) {
        e.f((Object)charSequence, "input");
        e.f((Object)l, "transform");
        int n = 0;
        xi2.e find$default = find$default(this, charSequence, 0, 2, null);
        if (find$default == null) {
            return charSequence.toString();
        }
        final int length = charSequence.length();
        final StringBuilder sb = new StringBuilder(length);
        MatcherMatchResult next;
        int n2;
        do {
            sb.append(charSequence, n, find$default.d().n());
            sb.append((CharSequence)l.invoke((Object)find$default));
            n2 = find$default.d().m() + 1;
            next = find$default.next();
            if (n2 >= length) {
                break;
            }
            n = n2;
        } while ((find$default = (xi2.e)next) != null);
        if (n2 < length) {
            sb.append(charSequence, n2, length);
        }
        final String string = sb.toString();
        e.e((Object)string, "sb.toString()");
        return string;
    }
    
    public final String replaceFirst(final CharSequence charSequence, final String s) {
        e.f((Object)charSequence, "input");
        e.f((Object)s, "replacement");
        final String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(s);
        e.e((Object)replaceFirst, "nativePattern.matcher(in\u2026replaceFirst(replacement)");
        return replaceFirst;
    }
    
    public final List<String> split(final CharSequence charSequence, int n) {
        e.f((Object)charSequence, "input");
        b.e1(n);
        final Matcher matcher = this.nativePattern.matcher(charSequence);
        if (n != 1 && matcher.find()) {
            int n2 = 10;
            if (n > 0) {
                if (n > 10) {
                    n2 = n2;
                }
                else {
                    n2 = n;
                }
            }
            final ArrayList list = new ArrayList<String>(n2);
            final int n3 = 0;
            final int n4 = n - 1;
            n = n3;
            int end;
            do {
                list.add(charSequence.subSequence(n, matcher.start()).toString());
                end = matcher.end();
                if (n4 >= 0 && list.size() == n4) {
                    break;
                }
                n = end;
            } while (matcher.find());
            list.add(charSequence.subSequence(end, charSequence.length()).toString());
            return (List<String>)list;
        }
        return d.l3((Object)charSequence.toString());
    }
    
    public final k<String> splitToSequence(final CharSequence charSequence, final int n) {
        e.f((Object)charSequence, "input");
        b.e1(n);
        return (k<String>)new n((p)new Regex$splitToSequence$1(this, charSequence, n, (gg2.c)null));
    }
    
    public final Pattern toPattern() {
        return this.nativePattern;
    }
    
    @Override
    public String toString() {
        final String string = this.nativePattern.toString();
        e.e((Object)string, "nativePattern.toString()");
        return string;
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013" }, d2 = { "Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "pattern", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "", "flags", "I", "getFlags", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 7, 1 })
    public static final class Serialized implements Serializable
    {
        public static final Serialized.Regex$Serialized$a Companion;
        private static final long serialVersionUID = 0L;
        private final int flags;
        private final String pattern;
        
        static {
            Companion = new Serialized.Regex$Serialized$a();
        }
        
        public Serialized(final String pattern, final int flags) {
            e.f((Object)pattern, "pattern");
            this.pattern = pattern;
            this.flags = flags;
        }
        
        private final Object readResolve() {
            final Pattern compile = Pattern.compile(this.pattern, this.flags);
            e.e((Object)compile, "compile(pattern, flags)");
            return new Regex(compile);
        }
        
        public final int getFlags() {
            return this.flags;
        }
        
        public final String getPattern() {
            return this.pattern;
        }
    }
    
    public static final class a
    {
    }
}
