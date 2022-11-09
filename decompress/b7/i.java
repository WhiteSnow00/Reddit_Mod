// 
// Decompiled by Procyon v0.6.0
// 

package b7;

import java.io.IOException;
import com.airbnb.lottie.model.DocumentData$Justification;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.JsonReader$a;
import com.airbnb.lottie.model.DocumentData;

public final class i implements l0<DocumentData>
{
    public static final i a;
    public static final JsonReader$a b;
    
    static {
        a = new i();
        b = JsonReader$a.a(new String[] { "t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of" });
    }
    
    public final Object a(final JsonReader jsonReader, float n) throws IOException {
        DocumentData$Justification documentData$Justification = DocumentData$Justification.CENTER;
        jsonReader.h();
        String q2;
        String q1 = q2 = null;
        int v = 0;
        int a2;
        int a = a2 = v;
        float n2 = n = 0.0f;
        float n4;
        float n3 = n4 = n;
        boolean o1 = true;
        while (jsonReader.hasNext()) {
            switch (jsonReader.y(i.b)) {
                default: {
                    jsonReader.A();
                    jsonReader.z1();
                    continue;
                }
                case 10: {
                    o1 = jsonReader.O1();
                    continue;
                }
                case 9: {
                    n4 = (float)jsonReader.t();
                    continue;
                }
                case 8: {
                    a2 = s.a(jsonReader);
                    continue;
                }
                case 7: {
                    a = s.a(jsonReader);
                    continue;
                }
                case 6: {
                    n3 = (float)jsonReader.t();
                    continue;
                }
                case 5: {
                    n = (float)jsonReader.t();
                    continue;
                }
                case 4: {
                    v = jsonReader.v();
                    continue;
                }
                case 3: {
                    final int v2 = jsonReader.v();
                    final DocumentData$Justification documentData$Justification2 = documentData$Justification = DocumentData$Justification.CENTER;
                    if (v2 > ((Enum)documentData$Justification2).ordinal()) {
                        continue;
                    }
                    if (v2 < 0) {
                        documentData$Justification = documentData$Justification2;
                        continue;
                    }
                    documentData$Justification = DocumentData$Justification.values()[v2];
                    continue;
                }
                case 2: {
                    n2 = (float)jsonReader.t();
                    continue;
                }
                case 1: {
                    q2 = jsonReader.Q1();
                    continue;
                }
                case 0: {
                    q1 = jsonReader.Q1();
                    continue;
                }
            }
        }
        jsonReader.r();
        return new DocumentData(q1, q2, n2, documentData$Justification, v, n, n3, a, a2, n4, o1);
    }
}
