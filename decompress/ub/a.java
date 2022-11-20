// 
// Decompiled by Procyon v0.6.0
// 

package ub;

import java.util.regex.Matcher;
import qb.a$b;
import java.nio.charset.CharacterCodingException;
import java.nio.ByteBuffer;
import qb.d;
import sg.b;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Pattern;
import ai2.h;

public final class a extends h
{
    public static final Pattern d;
    public final CharsetDecoder b;
    public final CharsetDecoder c;
    
    static {
        d = Pattern.compile("(.+?)='(.*?)';", 32);
    }
    
    public a() {
        this.b = sg.b.c.newDecoder();
        this.c = sg.b.b.newDecoder();
    }
    
    @Override
    public final qb.a w(final d d, final ByteBuffer byteBuffer) {
        final String s = null;
        CharSequence charSequence = null;
        try {
            this.b.decode(byteBuffer).toString();
        }
        catch (final CharacterCodingException ex) {
            this.b.reset();
            byteBuffer.rewind();
            try {
                this.c.decode(byteBuffer).toString();
            }
            catch (final CharacterCodingException ex2) {
                this.c.reset();
                byteBuffer.rewind();
                charSequence = null;
            }
            finally {
                this.c.reset();
                byteBuffer.rewind();
            }
        }
        finally {
            this.b.reset();
            byteBuffer.rewind();
        }
        final byte[] array = new byte[byteBuffer.limit()];
        byteBuffer.get(array);
        if (charSequence == null) {
            return new qb.a(new a$b[] { (a$b)new c(array, (String)null, (String)null) });
        }
        final Matcher matcher = a.d.matcher(charSequence);
        String s2 = null;
        int end = 0;
        String s3 = s;
        while (matcher.find(end)) {
            final String group = matcher.group(1);
            final String group2 = matcher.group(2);
            String s4 = s2;
            String s5 = s3;
            if (group != null) {
                final String p2 = zd.b.p1(group);
                p2.getClass();
                if (!p2.equals("streamurl")) {
                    if (!p2.equals("streamtitle")) {
                        s4 = s2;
                        s5 = s3;
                    }
                    else {
                        s5 = group2;
                        s4 = s2;
                    }
                }
                else {
                    s4 = group2;
                    s5 = s3;
                }
            }
            end = matcher.end();
            s2 = s4;
            s3 = s5;
        }
        return new qb.a(new a$b[] { (a$b)new c(array, s3, s2) });
    }
}
