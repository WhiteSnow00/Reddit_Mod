// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.EOFException;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataInput;
import java.nio.ByteBuffer;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.regex.Pattern;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Arrays;
import com.bytedance.covode.number.Covode;
import java.nio.ByteOrder;
import java.util.Set;
import android.content.res.AssetManager$AssetInputStream;
import java.util.HashSet;
import java.util.HashMap;
import java.nio.charset.Charset;

public final class 09t
{
    public static final int[] LIZ;
    public static final int[] LIZIZ;
    public static final byte[] LIZJ;
    public static final String[] LIZLLL;
    public static final int[] LJ;
    public static final byte[] LJFF;
    public static final c[][] LJI;
    public static final Charset LJII;
    public static final byte[] LJIIIIZZ;
    public static final byte[] LJIIIZ;
    public static final byte[] LJIIJ;
    public static final c[] LJIIJJI;
    public static final c[] LJIIL;
    public static final c[] LJIILIIL;
    public static final c[] LJIILJJIL;
    public static final c[] LJIILL;
    public static final c LJIILLIIL;
    public static final c[] LJIIZILJ;
    public static final c[] LJIJ;
    public static final c[] LJIJI;
    public static final c[] LJIJJ;
    public static final c[] LJIJJLI;
    public static final HashMap<Integer, c>[] LJIL;
    public static final HashMap<String, c>[] LJJ;
    public static final HashSet<String> LJJI;
    public static final HashMap<Integer, Integer> LJJIFFI;
    public final String LJJII;
    public final AssetManager$AssetInputStream LJJIII;
    public int LJJIIJ;
    public final HashMap<String, b>[] LJJIIJZLJL;
    public Set<Integer> LJJIIZ;
    public ByteOrder LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public int LJJIJL;
    public int LJJIJLIJ;
    
    static {
        Covode.recordClassIndex(1022);
        final Integer value = 1;
        final Integer value2 = 3;
        final Integer value3 = 2;
        final Integer value4 = 8;
        Arrays.asList(value, 6, value2, value4);
        final Integer value5 = 7;
        final Integer value6 = 5;
        Arrays.asList(value3, value5, 4, value6);
        LIZ = new int[] { 8, 8, 8 };
        LIZIZ = new int[] { 8 };
        LIZJ = new byte[] { -1, -40, -1 };
        LJIIIZ = new byte[] { 79, 76, 89, 77, 80, 0 };
        LJIIJ = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
        LIZLLL = new String[] { "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE" };
        LJ = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1 };
        LJFF = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
        final c[] array = LJIIJJI = new c[] { new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256), new c("ImageLength", 257), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278), new c("StripByteCounts", 279), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7) };
        final c[] array2 = LJIIL = new c[] { new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962), new c("PixelYDimension", 40963), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720) };
        final c[] array3 = LJIILIIL = new c[] { new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3) };
        final c[] array4 = LJIILJJIL = new c[] { new c("InteroperabilityIndex", 1, 2) };
        final c[] array5 = LJIILL = new c[] { new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256), new c("ThumbnailImageLength", 257), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278), new c("StripByteCounts", 279), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720) };
        LJIILLIIL = new c("StripOffsets", 273, 3);
        final c[][] array6 = LJI = new c[][] { array, array2, array3, array4, array5, array, LJIIZILJ = new c[] { new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4) }, LJIJ = new c[] { new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4) }, LJIJI = new c[] { new c("AspectFrame", 4371, 3) }, LJIJJ = new c[] { new c("ColorSpace", 55, 3) } };
        LJIJJLI = new c[] { new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1) };
        new c("JPEGInterchangeFormat", 513, 4);
        new c("JPEGInterchangeFormatLength", 514, 4);
        LJIL = new HashMap[array6.length];
        LJJ = new HashMap[array6.length];
        LJJI = new HashSet<String>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        LJJIFFI = new HashMap<Integer, Integer>();
        LJIIIIZZ = "Exif\u0000\u0000".getBytes(LJII = Charset.forName("US-ASCII"));
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int n = 0;
        while (true) {
            final c[][] lji = 09t.LJI;
            if (n >= lji.length) {
                break;
            }
            09t.LJIL[n] = new HashMap<Integer, c>();
            09t.LJJ[n] = new HashMap<String, c>();
            for (final c c : lji[n]) {
                09t.LJIL[n].put(c.LIZ, c);
                09t.LJJ[n].put(c.LIZIZ, c);
            }
            ++n;
        }
        final HashMap<Integer, Integer> ljjiffi = 09t.LJJIFFI;
        final c[] ljijjli = 09t.LJIJJLI;
        ljjiffi.put(ljijjli[0].LIZ, value6);
        ljjiffi.put(ljijjli[1].LIZ, value);
        ljjiffi.put(ljijjli[2].LIZ, value3);
        ljjiffi.put(ljijjli[3].LIZ, value2);
        ljjiffi.put(ljijjli[4].LIZ, value5);
        ljjiffi.put(ljijjli[5].LIZ, value4);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }
    
    public 09t(final InputStream inputStream) {
        final c[][] lji = 09t.LJI;
        this.LJJIIJZLJL = new HashMap[lji.length];
        this.LJJIIZ = new HashSet<Integer>(lji.length);
        this.LJJIIZI = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.LJJII = null;
            if (inputStream instanceof AssetManager$AssetInputStream) {
                this.LJJIII = (AssetManager$AssetInputStream)inputStream;
            }
            else {
                this.LJJIII = null;
            }
            this.LIZ(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }
    
    public 09t(final String ljjii) {
        final c[][] lji = 09t.LJI;
        this.LJJIIJZLJL = new HashMap[lji.length];
        this.LJJIIZ = new HashSet<Integer>(lji.length);
        this.LJJIIZI = ByteOrder.BIG_ENDIAN;
        if (ljjii == null) {
            throw new IllegalArgumentException("filename cannot be null");
        }
        final Closeable closeable = null;
        this.LJJIII = null;
        this.LJJII = ljjii;
        Closeable closeable2;
        try {
            final FileInputStream fileInputStream = new FileInputStream(ljjii);
            try {
                this.LIZ(fileInputStream);
                LIZ((Closeable)fileInputStream);
                return;
            }
            finally {}
        }
        finally {
            closeable2 = closeable;
        }
        LIZ(closeable2);
    }
    
    private b LIZ(final String s) {
        String s2 = s;
        if ("ISOSpeedRatings".equals(s)) {
            s2 = "PhotographicSensitivity";
        }
        for (int i = 0; i < 09t.LJI.length; ++i) {
            final b b = this.LJJIIJZLJL[i].get(s2);
            if (b != null) {
                return b;
            }
        }
        return null;
    }
    
    private void LIZ() {
        final String liziz = this.LIZIZ("DateTimeOriginal");
        if (liziz != null && this.LIZIZ("DateTime") == null) {
            this.LJJIIJZLJL[0].put("DateTime", b.LIZ(liziz));
        }
        if (this.LIZIZ("ImageWidth") == null) {
            this.LJJIIJZLJL[0].put("ImageWidth", b.LIZ(0L, this.LJJIIZI));
        }
        if (this.LIZIZ("ImageLength") == null) {
            this.LJJIIJZLJL[0].put("ImageLength", b.LIZ(0L, this.LJJIIZI));
        }
        if (this.LIZIZ("Orientation") == null) {
            this.LJJIIJZLJL[0].put("Orientation", b.LIZ(0L, this.LJJIIZI));
        }
        if (this.LIZIZ("LightSource") == null) {
            this.LJJIIJZLJL[1].put("LightSource", b.LIZ(0L, this.LJJIIZI));
        }
    }
    
    private void LIZ(final int n, final int n2) {
        if (!this.LJJIIJZLJL[n].isEmpty() && !this.LJJIIJZLJL[n2].isEmpty()) {
            final b b = this.LJJIIJZLJL[n].get("ImageLength");
            final b b2 = this.LJJIIJZLJL[n].get("ImageWidth");
            final b b3 = this.LJJIIJZLJL[n2].get("ImageLength");
            final b b4 = this.LJJIIJZLJL[n2].get("ImageWidth");
            if (b != null && b2 != null && b3 != null && b4 != null) {
                final int liziz = b.LIZIZ(this.LJJIIZI);
                final int liziz2 = b2.LIZIZ(this.LJJIIZI);
                final int liziz3 = b3.LIZIZ(this.LJJIIZI);
                final int liziz4 = b4.LIZIZ(this.LJJIIZI);
                if (liziz < liziz3 && liziz2 < liziz4) {
                    final HashMap<String, b>[] ljjiijzljl = this.LJJIIJZLJL;
                    final HashMap<String, b> hashMap = ljjiijzljl[n];
                    ljjiijzljl[n] = ljjiijzljl[n2];
                    ljjiijzljl[n2] = hashMap;
                }
            }
        }
    }
    
    private void LIZ(a a) {
        this.LIZ(a, a.available());
        this.LIZIZ(a, 0);
        this.LIZLLL(a, 0);
        this.LIZLLL(a, 5);
        this.LIZLLL(a, 4);
        this.LIZIZ();
        if (this.LJJIIJ == 8) {
            final b b = this.LJJIIJZLJL[1].get("MakerNote");
            if (b != null) {
                a = new a(b.LIZJ);
                a.LIZ = this.LJJIIZI;
                a.LIZ(6L);
                this.LIZIZ(a, 9);
                final b value = this.LJJIIJZLJL[9].get("ColorSpace");
                if (value != null) {
                    this.LJJIIJZLJL[1].put("ColorSpace", value);
                }
            }
        }
    }
    
    private void LIZ(final a a, int n) {
        final ByteOrder lizj = this.LIZJ(a);
        this.LJJIIZI = lizj;
        a.LIZ = lizj;
        final int unsignedShort = a.readUnsignedShort();
        final int ljjiij = this.LJJIIJ;
        if (ljjiij != 7 && ljjiij != 10 && unsignedShort != 42) {
            final StringBuilder sb = new StringBuilder("Invalid start code: ");
            sb.append(Integer.toHexString(unsignedShort));
            throw new IOException(sb.toString());
        }
        final int int1 = a.readInt();
        if (int1 < 8 || int1 >= n) {
            throw new IOException("Invalid first Ifd offset: ".concat(String.valueOf(int1)));
        }
        n = int1 - 8;
        if (n <= 0 || a.skipBytes(n) == n) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: ".concat(String.valueOf(n)));
    }
    
    private void LIZ(final a a, int n, final int n2) {
        a.LIZ = ByteOrder.BIG_ENDIAN;
        a.LIZ(n);
        final byte byte1 = a.readByte();
        if (byte1 != -1) {
            final StringBuilder sb = new StringBuilder("Invalid marker: ");
            sb.append(Integer.toHexString(byte1 & 0xFF));
            throw new IOException(sb.toString());
        }
        if (a.readByte() != -40) {
            final StringBuilder sb2 = new StringBuilder("Invalid marker: ");
            sb2.append(Integer.toHexString(255));
            throw new IOException(sb2.toString());
        }
        n = n + 1 + 1;
    Label_0231_Outer:
        while (true) {
            final byte byte2 = a.readByte();
            if (byte2 != -1) {
                final StringBuilder sb3 = new StringBuilder("Invalid marker:");
                sb3.append(Integer.toHexString(byte2 & 0xFF));
                throw new IOException(sb3.toString());
            }
            final byte byte3 = a.readByte();
            if (byte3 == -39 || byte3 == -38) {
                a.LIZ = this.LJJIIZI;
                return;
            }
            int n3 = a.readUnsignedShort() - 2;
            n = n + 1 + 1 + 2;
            if (n3 < 0) {
                throw new IOException("Invalid length");
            }
            while (true) {
                int n5 = 0;
                Label_0503: {
                    Label_0434: {
                        int n4;
                        if (byte3 != -31) {
                            if (byte3 != -2) {
                                switch (byte3) {
                                    default:
                                        Label_0440: {
                                            switch (byte3) {
                                                default: {
                                                    switch (byte3) {
                                                        default: {
                                                            switch (byte3) {
                                                                default: {
                                                                    n4 = n;
                                                                    n5 = n3;
                                                                    break Label_0231;
                                                                }
                                                                case -51:
                                                                case -50:
                                                                case -49: {
                                                                    break Label_0440;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        case -55:
                                                        case -54:
                                                        case -53: {
                                                            break Label_0440;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case -59:
                                                case -58:
                                                case -57: {
                                                    break Label_0440;
                                                }
                                            }
                                            break;
                                        }
                                    case -64:
                                    case -63:
                                    case -62:
                                    case -61: {
                                        if (a.skipBytes(1) == 1) {
                                            this.LJJIIJZLJL[n2].put("ImageLength", b.LIZ((long)a.readUnsignedShort(), this.LJJIIZI));
                                            this.LJJIIJZLJL[n2].put("ImageWidth", b.LIZ((long)a.readUnsignedShort(), this.LJJIIZI));
                                            n5 = n3 - 5;
                                            break Label_0503;
                                        }
                                        throw new IOException("Invalid SOFx");
                                    }
                                }
                            }
                            else {
                                final byte[] array = new byte[n3];
                                if (a.read(array) != n3) {
                                    throw new IOException("Invalid exif");
                                }
                                n4 = n;
                                if (this.LIZIZ("UserComment") == null) {
                                    this.LJJIIJZLJL[1].put("UserComment", b.LIZ(new String(array, 09t.LJII)));
                                    n4 = n;
                                }
                                break Label_0434;
                            }
                        }
                        else {
                            n5 = n3;
                            n4 = n;
                            if (n3 >= 6) {
                                final byte[] array2 = new byte[6];
                                if (a.read(array2) != 6) {
                                    throw new IOException("Invalid exif");
                                }
                                final int ljjijiiji = n + 6;
                                n3 -= 6;
                                n5 = n3;
                                n = ljjijiiji;
                                if (!Arrays.equals(array2, 09t.LJIIIIZZ)) {
                                    break Label_0503;
                                }
                                if (n3 <= 0) {
                                    throw new IOException("Invalid exif");
                                }
                                this.LJJIJIIJI = ljjijiiji;
                                final byte[] array3 = new byte[n3];
                                if (a.read(array3) == n3) {
                                    n4 = ljjijiiji + n3;
                                    final a a2 = new a(array3);
                                    this.LIZ(a2, n3);
                                    this.LIZIZ(a2, n2);
                                    break Label_0434;
                                }
                                throw new IOException("Invalid exif");
                            }
                        }
                        if (a.skipBytes(n5) == n5) {
                            n = n4 + n5;
                            continue Label_0231_Outer;
                        }
                        throw new IOException("Invalid JPEG segment");
                    }
                    n5 = 0;
                    continue;
                }
                if (n5 >= 0) {
                    final int n4 = n;
                    continue;
                }
                break;
            }
            throw new IOException("Invalid length");
        }
    }
    
    private void LIZ(final a a, final HashMap hashMap) {
        final b b = hashMap.get("JPEGInterchangeFormat");
        final b b2 = hashMap.get("JPEGInterchangeFormatLength");
        if (b != null && b2 != null) {
            final int liziz = b.LIZIZ(this.LJJIIZI);
            final int min = Math.min(b2.LIZIZ(this.LJJIIZI), a.available() - liziz);
            final int ljjiij = this.LJJIIJ;
            int n2 = 0;
            Label_0097: {
                int n;
                if (ljjiij == 4 || ljjiij == 9 || ljjiij == 10) {
                    n = this.LJJIJIIJI;
                }
                else {
                    n2 = liziz;
                    if (ljjiij != 7) {
                        break Label_0097;
                    }
                    n = this.LJJIJIIJIL;
                }
                n2 = liziz + n;
            }
            if (n2 > 0 && min > 0 && this.LJJII == null && this.LJJIII == null) {
                final byte[] array = new byte[min];
                a.LIZ(n2);
                a.readFully(array);
            }
        }
    }
    
    public static void LIZ(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0017;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (final RuntimeException ex) {
            throw ex;
        }
        catch (final Exception ex2) {
            goto Label_0017;
        }
    }
    
    private void LIZ(final InputStream inputStream) {
        int i = 0;
        try {
            while (i < 09t.LJI.length) {
                this.LJJIIJZLJL[i] = new HashMap<String, b>();
                ++i;
            }
            final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            bufferedInputStream.mark(5000);
            final byte[] array = new byte[5000];
            bufferedInputStream.read(array);
            bufferedInputStream.reset();
            int ljjiij;
            if (LIZ(array)) {
                ljjiij = 4;
            }
            else if (this.LIZIZ(array)) {
                ljjiij = 9;
            }
            else {
                final a a = new a(array);
                final ByteOrder lizj = this.LIZJ(a);
                this.LJJIIZI = lizj;
                a.LIZ = lizj;
                final short short1 = a.readShort();
                a.close();
                if (short1 == 20306 || short1 == 21330) {
                    ljjiij = 7;
                }
                else {
                    final a a2 = new a(array);
                    final ByteOrder lizj2 = this.LIZJ(a2);
                    this.LJJIIZI = lizj2;
                    a2.LIZ = lizj2;
                    final short short2 = a2.readShort();
                    a2.close();
                    if (short2 == 85) {
                        ljjiij = 10;
                    }
                    else {
                        ljjiij = 0;
                    }
                }
            }
            this.LJJIIJ = ljjiij;
            final a a3 = new a(bufferedInputStream);
            switch (this.LJJIIJ) {
                case 10: {
                    this.LIZ(a3);
                    if (this.LJJIIJZLJL[0].get("JpgFromRaw") != null) {
                        this.LIZ(a3, this.LJJIJLIJ, 5);
                    }
                    final b b = this.LJJIIJZLJL[0].get("ISO");
                    final b b2 = this.LJJIIJZLJL[1].get("PhotographicSensitivity");
                    if (b != null && b2 == null) {
                        this.LJJIIJZLJL[1].put("PhotographicSensitivity", b);
                        break;
                    }
                    break;
                }
                case 9: {
                    this.LIZIZ(a3);
                    break;
                }
                case 7: {
                    this.LIZ(a3);
                    final b b3 = this.LJJIIJZLJL[1].get("MakerNote");
                    if (b3 == null) {
                        break;
                    }
                    final a a4 = new a(b3.LIZJ);
                    a4.LIZ = this.LJJIIZI;
                    final byte[] ljiiiz = 09t.LJIIIZ;
                    final byte[] array2 = new byte[ljiiiz.length];
                    a4.readFully(array2);
                    a4.LIZ(0L);
                    final byte[] ljiij = 09t.LJIIJ;
                    final byte[] array3 = new byte[ljiij.length];
                    a4.readFully(array3);
                    if (Arrays.equals(array2, ljiiiz)) {
                        a4.LIZ(8L);
                    }
                    else if (Arrays.equals(array3, ljiij)) {
                        a4.LIZ(12L);
                    }
                    this.LIZIZ(a4, 6);
                    final b b4 = this.LJJIIJZLJL[7].get("PreviewImageStart");
                    final b b5 = this.LJJIIJZLJL[7].get("PreviewImageLength");
                    if (b4 != null && b5 != null) {
                        this.LJJIIJZLJL[5].put("JPEGInterchangeFormat", b4);
                        this.LJJIIJZLJL[5].put("JPEGInterchangeFormatLength", b5);
                    }
                    final b b6 = this.LJJIIJZLJL[8].get("AspectFrame");
                    if (b6 == null) {
                        break;
                    }
                    final int[] array4 = (int[])b6.LIZ(this.LJJIIZI);
                    if (array4 == null) {
                        break;
                    }
                    if (array4.length != 4) {
                        break;
                    }
                    if (array4[2] > array4[0] && array4[3] > array4[1]) {
                        final int n = array4[2] - array4[0] + 1;
                        final int n2 = array4[3] - array4[1] + 1;
                        int n3;
                        int n4;
                        if ((n3 = n) < (n4 = n2)) {
                            final int n5 = n + n2;
                            n4 = n5 - n2;
                            n3 = n5 - n4;
                        }
                        final b liz = b.LIZ(n3, this.LJJIIZI);
                        final b liz2 = b.LIZ(n4, this.LJJIIZI);
                        this.LJJIIJZLJL[0].put("ImageWidth", liz);
                        this.LJJIIJZLJL[0].put("ImageLength", liz2);
                        break;
                    }
                    break;
                }
                case 4: {
                    this.LIZ(a3, 0, 0);
                    break;
                }
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11: {
                    this.LIZ(a3);
                    break;
                }
            }
            final HashMap<String, b> hashMap = this.LJJIIJZLJL[4];
            final b b7 = hashMap.get("Compression");
            if (b7 != null) {
                final int liziz = b7.LIZIZ(this.LJJIIZI);
                if ((this.LJJIJ = liziz) != 1) {
                    if (liziz == 6) {
                        this.LIZ(a3, hashMap);
                        return;
                    }
                    if (liziz != 7) {
                        return;
                    }
                }
                final b b8 = hashMap.get("BitsPerSample");
                if (b8 != null) {
                    final int[] array5 = (int[])b8.LIZ(this.LJJIIZI);
                    final int[] liz3 = 09t.LIZ;
                    if (!Arrays.equals(liz3, array5)) {
                        if (this.LJJIIJ != 3) {
                            return;
                        }
                        final b b9 = hashMap.get("PhotometricInterpretation");
                        if (b9 == null) {
                            return;
                        }
                        final int liziz2 = b9.LIZIZ(this.LJJIIZI);
                        if (liziz2 == 1) {
                            if (!Arrays.equals(array5, 09t.LIZIZ)) {
                                return;
                            }
                        }
                        else if (liziz2 != 6 || !Arrays.equals(array5, liz3)) {
                            return;
                        }
                    }
                    this.LIZIZ(a3, hashMap);
                }
            }
            else {
                this.LJJIJ = 6;
                this.LIZ(a3, hashMap);
            }
        }
        catch (final IOException ex) {}
        finally {
            this.LIZ();
        }
    }
    
    private boolean LIZ(final HashMap hashMap) {
        final b b = hashMap.get("ImageLength");
        final b b2 = hashMap.get("ImageWidth");
        if (b != null && b2 != null) {
            final int liziz = b.LIZIZ(this.LJJIIZI);
            final int liziz2 = b2.LIZIZ(this.LJJIIZI);
            if (liziz <= 512 && liziz2 <= 512) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean LIZ(final byte[] array) {
        int n = 0;
        while (true) {
            final byte[] lizj = 09t.LIZJ;
            if (n >= lizj.length) {
                return true;
            }
            if (array[n] != lizj[n]) {
                return false;
            }
            ++n;
        }
    }
    
    public static long[] LIZ(final Object o) {
        if (o instanceof int[]) {
            final int[] array = (int[])o;
            final long[] array2 = new long[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        if (o instanceof long[]) {
            return (long[])o;
        }
        return null;
    }
    
    private String LIZIZ(final String s) {
        final b liz = this.LIZ(s);
        Label_0388: {
            if (liz == null) {
                break Label_0388;
            }
            if (!09t.LJJI.contains(s)) {
                return liz.LIZJ(this.LJJIIZI);
            }
            if (s.equals("GPSTimeStamp")) {
                if (liz.LIZ != 5 && liz.LIZ != 10) {
                    return null;
                }
                final d[] array = (d[])liz.LIZ(this.LJJIIZI);
                if (array == null || array.length != 3) {
                    return null;
                }
                return 0II.LIZ("%02d:%02d:%02d", new Object[] { (int)(array[0].LIZ / (float)array[0].LIZIZ), (int)(array[1].LIZ / (float)array[1].LIZIZ), (int)(array[2].LIZ / (float)array[2].LIZIZ) });
            }
            try {
                final Object liz2 = liz.LIZ(this.LJJIIZI);
                if (liz2 != null) {
                    double double1;
                    if (liz2 instanceof String) {
                        double1 = Double.parseDouble((String)liz2);
                    }
                    else if (liz2 instanceof long[]) {
                        final long[] array2 = (long[])liz2;
                        if (array2.length != 1) {
                            throw new NumberFormatException("There are more than one component");
                        }
                        double1 = (double)array2[0];
                    }
                    else if (liz2 instanceof int[]) {
                        final int[] array3 = (int[])liz2;
                        if (array3.length != 1) {
                            throw new NumberFormatException("There are more than one component");
                        }
                        double1 = array3[0];
                    }
                    else if (liz2 instanceof double[]) {
                        final double[] array4 = (double[])liz2;
                        if (array4.length != 1) {
                            throw new NumberFormatException("There are more than one component");
                        }
                        double1 = array4[0];
                    }
                    else {
                        if (!(liz2 instanceof d[])) {
                            throw new NumberFormatException("Couldn't find a double value");
                        }
                        final d[] array5 = (d[])liz2;
                        if (array5.length != 1) {
                            throw new NumberFormatException("There are more than one component");
                        }
                        final d d = array5[0];
                        double1 = d.LIZ / (double)d.LIZIZ;
                    }
                    return Double.toString(double1);
                }
                throw new NumberFormatException("NULL can't be converted to a double value");
                return null;
            }
            catch (final NumberFormatException ex) {
                return null;
            }
        }
    }
    
    private void LIZIZ() {
        this.LIZ(0, 5);
        this.LIZ(0, 4);
        this.LIZ(5, 4);
        final b value = this.LJJIIJZLJL[1].get("PixelXDimension");
        final b value2 = this.LJJIIJZLJL[1].get("PixelYDimension");
        if (value != null && value2 != null) {
            this.LJJIIJZLJL[0].put("ImageWidth", value);
            this.LJJIIJZLJL[0].put("ImageLength", value2);
        }
        if (this.LJJIIJZLJL[4].isEmpty() && this.LIZ(this.LJJIIJZLJL[5])) {
            final HashMap<String, b>[] ljjiijzljl = this.LJJIIJZLJL;
            ljjiijzljl[4] = ljjiijzljl[5];
            ljjiijzljl[5] = new HashMap<String, b>();
        }
        this.LIZ(this.LJJIIJZLJL[4]);
    }
    
    private void LIZIZ(final a a) {
        a.skipBytes(84);
        final byte[] array = new byte[4];
        final byte[] array2 = new byte[4];
        a.read(array);
        a.skipBytes(4);
        a.read(array2);
        final int int1 = ByteBuffer.wrap(array).getInt();
        final int int2 = ByteBuffer.wrap(array2).getInt();
        this.LIZ(a, int1, 5);
        a.LIZ(int2);
        a.LIZ = ByteOrder.BIG_ENDIAN;
        for (int int3 = a.readInt(), i = 0; i < int3; ++i) {
            final int unsignedShort = a.readUnsignedShort();
            final int unsignedShort2 = a.readUnsignedShort();
            if (unsignedShort == 09t.LJIILLIIL.LIZ) {
                final short short1 = a.readShort();
                final short short2 = a.readShort();
                final b liz = b.LIZ(short1, this.LJJIIZI);
                final b liz2 = b.LIZ(short2, this.LJJIIZI);
                this.LJJIIJZLJL[0].put("ImageLength", liz);
                this.LJJIIJZLJL[0].put("ImageWidth", liz2);
                return;
            }
            a.skipBytes(unsignedShort2);
        }
    }
    
    private void LIZIZ(final a a, int n) {
        while (true) {
            this.LJJIIZ.add(a.LIZJ);
            if (a.LIZJ + 2 > a.LIZIZ) {
                return;
            }
            final short short1 = a.readShort();
            if (a.LIZJ + short1 * 12 > a.LIZIZ || short1 <= 0) {
                break;
            }
        Label_0344_Outer:
            for (short n2 = 0; n2 < short1; ++n2) {
                final int unsignedShort = a.readUnsignedShort();
                final int unsignedShort2 = a.readUnsignedShort();
                final int int1 = a.readInt();
                final long n3 = a.LIZJ + 4L;
                final c c = 09t.LJIL[n].get(unsignedShort);
                if (c != null && unsignedShort2 > 0) {
                    final int[] lj = 09t.LJ;
                    if (unsignedShort2 < lj.length && c.LIZ(unsignedShort2)) {
                        int lizj;
                        if ((lizj = unsignedShort2) == 7) {
                            lizj = c.LIZJ;
                        }
                        final long n4 = int1 * (long)lj[lizj];
                        if (n4 >= 0L) {
                            if (n4 <= 2147483647L) {
                                int n5 = n;
                                if (n4 > 4L) {
                                    final int int2 = a.readInt();
                                    final int ljjiij = this.LJJIIJ;
                                    if (ljjiij == 7) {
                                        if ("MakerNote".equals(c.LIZIZ)) {
                                            this.LJJIJIIJIL = int2;
                                            n5 = n;
                                        }
                                        else if ((n5 = n) == 6) {
                                            n5 = n;
                                            if ("ThumbnailImage".equals(c.LIZIZ)) {
                                                this.LJJIJIL = int2;
                                                this.LJJIJL = int1;
                                                final b liz = b.LIZ(6, this.LJJIIZI);
                                                n = this.LJJIJIL;
                                                n5 = 6;
                                                final b liz2 = b.LIZ((long)n, this.LJJIIZI);
                                                final b liz3 = b.LIZ((long)this.LJJIJL, this.LJJIIZI);
                                                this.LJJIIJZLJL[4].put("Compression", liz);
                                                this.LJJIIJZLJL[4].put("JPEGInterchangeFormat", liz2);
                                                this.LJJIIJZLJL[4].put("JPEGInterchangeFormatLength", liz3);
                                            }
                                        }
                                    }
                                    else {
                                        n5 = n;
                                        if (ljjiij == 10) {
                                            n5 = n;
                                            if ("JpgFromRaw".equals(c.LIZIZ)) {
                                                this.LJJIJLIJ = int2;
                                                n5 = n;
                                            }
                                        }
                                    }
                                    final long n6 = int2;
                                    if (n6 + n4 > a.LIZIZ) {
                                        a.LIZ(n3);
                                        n = n5;
                                        continue;
                                    }
                                    a.LIZ(n6);
                                }
                                final Integer n7 = 09t.LJJIFFI.get(unsignedShort);
                                if (n7 != null) {
                                    while (true) {
                                        long liz4 = 0L;
                                        Label_0390: {
                                            Label_0386: {
                                                if (lizj == 3) {
                                                    n = a.readUnsignedShort();
                                                    break Label_0386;
                                                }
                                                if (lizj == 4) {
                                                    liz4 = a.LIZ();
                                                    break Label_0390;
                                                }
                                                if (lizj == 8) {
                                                    n = a.readShort();
                                                    break Label_0386;
                                                }
                                                if (lizj == 9 || lizj == 13) {
                                                    n = a.readInt();
                                                    break Label_0386;
                                                }
                                                a.LIZ(n3);
                                                n = n5;
                                                continue Label_0344_Outer;
                                            }
                                            liz4 = n;
                                        }
                                        if (liz4 > 0L && liz4 < a.LIZIZ && !this.LJJIIZ.contains((int)liz4)) {
                                            a.LIZ(liz4);
                                            this.LIZIZ(a, n7);
                                        }
                                        continue;
                                    }
                                }
                                else {
                                    final byte[] array = new byte[(int)n4];
                                    a.readFully(array);
                                    final b b = new b(lizj, int1, array);
                                    this.LJJIIJZLJL[n5].put(c.LIZIZ, b);
                                    if ("DNGVersion".equals(c.LIZIZ)) {
                                        this.LJJIIJ = 3;
                                    }
                                    if ((("Make".equals(c.LIZIZ) || "Model".equals(c.LIZIZ)) && b.LIZJ(this.LJJIIZI).contains("PENTAX")) || ("Compression".equals(c.LIZIZ) && b.LIZIZ(this.LJJIIZI) == 65535)) {
                                        this.LJJIIJ = 8;
                                    }
                                    n = n5;
                                    if (a.LIZJ != n3) {
                                        a.LIZ(n3);
                                        n = n5;
                                    }
                                    continue;
                                }
                            }
                        }
                    }
                }
                a.LIZ(n3);
            }
            if (a.LIZJ + 4 > a.LIZIZ) {
                break;
            }
            n = a.readInt();
            final long n8 = n;
            if (n8 <= 0L || n >= a.LIZIZ || this.LJJIIZ.contains(n)) {
                break;
            }
            a.LIZ(n8);
            if (this.LJJIIJZLJL[4].isEmpty()) {
                n = 4;
            }
            else {
                final HashMap<String, b>[] ljjiijzljl = this.LJJIIJZLJL;
                n = 5;
                if (ljjiijzljl[5].isEmpty()) {
                    continue;
                }
                break;
            }
        }
    }
    
    private void LIZIZ(final a a, final HashMap hashMap) {
        final b b = hashMap.get("StripOffsets");
        final b b2 = hashMap.get("StripByteCounts");
        if (b != null && b2 != null) {
            final long[] liz = LIZ(b.LIZ(this.LJJIIZI));
            final long[] liz2 = LIZ(b2.LIZ(this.LJJIIZI));
            if (liz == null) {
                return;
            }
            if (liz2 == null) {
                return;
            }
            long n = 0L;
            for (int length = liz2.length, i = 0; i < length; ++i) {
                n += liz2[i];
            }
            final byte[] array = new byte[(int)n];
            int j = 0;
            int n2 = 0;
            int n3 = 0;
            while (j < liz.length) {
                final int n4 = (int)liz[j];
                final int n5 = (int)liz2[j];
                final int n6 = n4 - n2;
                a.LIZ(n6);
                final byte[] array2 = new byte[n5];
                a.read(array2);
                n2 = n2 + n6 + n5;
                System.arraycopy(array2, 0, array, n3, n5);
                n3 += n5;
                ++j;
            }
        }
    }
    
    private boolean LIZIZ(final byte[] array) {
        final byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; ++i) {
            if (array[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }
    
    private ByteOrder LIZJ(final a a) {
        final short short1 = a.readShort();
        if (short1 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (short1 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        final StringBuilder sb = new StringBuilder("Invalid byte order: ");
        sb.append(Integer.toHexString(short1));
        throw new IOException(sb.toString());
    }
    
    private void LIZJ(final a a, final int n) {
        final b value = this.LJJIIJZLJL[n].get("ImageLength");
        final b value2 = this.LJJIIJZLJL[n].get("ImageWidth");
        if (value == null || value2 == null) {
            final b b = this.LJJIIJZLJL[n].get("JPEGInterchangeFormat");
            if (b != null) {
                this.LIZ(a, b.LIZIZ(this.LJJIIZI), n);
            }
        }
    }
    
    private void LIZLLL(final a a, final int n) {
        final b b = this.LJJIIJZLJL[n].get("DefaultCropSize");
        final b b2 = this.LJJIIJZLJL[n].get("SensorTopBorder");
        final b b3 = this.LJJIIJZLJL[n].get("SensorLeftBorder");
        final b b4 = this.LJJIIJZLJL[n].get("SensorBottomBorder");
        final b b5 = this.LJJIIJZLJL[n].get("SensorRightBorder");
        if (b != null) {
            b b6 = null;
            b b7 = null;
            Label_0187: {
                if (b.LIZ == 5) {
                    final d[] array = (d[])b.LIZ(this.LJJIIZI);
                    if (array == null || array.length != 2) {
                        return;
                    }
                    b6 = 09t.b.LIZ(array[0], this.LJJIIZI);
                    b7 = 09t.b.LIZ(array[1], this.LJJIIZI);
                    break Label_0187;
                }
                else {
                    final int[] array2 = (int[])b.LIZ(this.LJJIIZI);
                    if (array2 != null && array2.length == 2) {
                        b6 = 09t.b.LIZ(array2[0], this.LJJIIZI);
                        b7 = 09t.b.LIZ(array2[1], this.LJJIIZI);
                        break Label_0187;
                    }
                }
                return;
            }
            this.LJJIIJZLJL[n].put("ImageWidth", b6);
            this.LJJIIJZLJL[n].put("ImageLength", b7);
            return;
        }
        if (b2 != null && b3 != null && b4 != null && b5 != null) {
            final int liziz = b2.LIZIZ(this.LJJIIZI);
            final int liziz2 = b4.LIZIZ(this.LJJIIZI);
            final int liziz3 = b5.LIZIZ(this.LJJIIZI);
            final int liziz4 = b3.LIZIZ(this.LJJIIZI);
            if (liziz2 > liziz && liziz3 > liziz4) {
                final b liz = 09t.b.LIZ(liziz2 - liziz, this.LJJIIZI);
                final b liz2 = 09t.b.LIZ(liziz3 - liziz4, this.LJJIIZI);
                this.LJJIIJZLJL[n].put("ImageLength", liz);
                this.LJJIIJZLJL[n].put("ImageWidth", liz2);
            }
            return;
        }
        this.LIZJ(a, n);
    }
    
    public final int LIZ(final String s, final int n) {
        final b liz = this.LIZ(s);
        if (liz == null) {
            return n;
        }
        try {
            return liz.LIZIZ(this.LJJIIZI);
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public static final class a extends InputStream implements DataInput
    {
        public static final ByteOrder LIZLLL;
        public static final ByteOrder LJ;
        public ByteOrder LIZ;
        public final int LIZIZ;
        public int LIZJ;
        public DataInputStream LJFF;
        
        static {
            Covode.recordClassIndex(1023);
            LIZLLL = ByteOrder.LITTLE_ENDIAN;
            LJ = ByteOrder.BIG_ENDIAN;
        }
        
        public a(final InputStream inputStream) {
            this.LIZ = ByteOrder.BIG_ENDIAN;
            final DataInputStream ljff = new DataInputStream(inputStream);
            this.LJFF = ljff;
            final int available = ljff.available();
            this.LIZIZ = available;
            this.LIZJ = 0;
            this.LJFF.mark(available);
        }
        
        public a(final byte[] array) {
            this(new ByteArrayInputStream(array));
        }
        
        public final long LIZ() {
            return (long)this.readInt() & 0xFFFFFFFFL;
        }
        
        public final void LIZ(long n) {
            final int lizj = this.LIZJ;
            if (lizj > n) {
                this.LIZJ = 0;
                this.LJFF.reset();
                this.LJFF.mark(this.LIZIZ);
            }
            else {
                n -= lizj;
            }
            final int n2 = (int)n;
            if (this.skipBytes(n2) == n2) {
                return;
            }
            throw new IOException("Couldn't seek up to the byteCount");
        }
        
        @Override
        public final int available() {
            return this.LJFF.available();
        }
        
        @Override
        public final int read() {
            ++this.LIZJ;
            return this.LJFF.read();
        }
        
        @Override
        public final int read(final byte[] array, int read, final int n) {
            read = this.LJFF.read(array, read, n);
            this.LIZJ += read;
            return read;
        }
        
        @Override
        public final boolean readBoolean() {
            ++this.LIZJ;
            return this.LJFF.readBoolean();
        }
        
        @Override
        public final byte readByte() {
            final int lizj = this.LIZJ + 1;
            this.LIZJ = lizj;
            if (lizj > this.LIZIZ) {
                throw new EOFException();
            }
            final int read = this.LJFF.read();
            if (read >= 0) {
                return (byte)read;
            }
            throw new EOFException();
        }
        
        @Override
        public final char readChar() {
            this.LIZJ += 2;
            return this.LJFF.readChar();
        }
        
        @Override
        public final double readDouble() {
            return Double.longBitsToDouble(this.readLong());
        }
        
        @Override
        public final float readFloat() {
            return Float.intBitsToFloat(this.readInt());
        }
        
        @Override
        public final void readFully(final byte[] array) {
            final int lizj = this.LIZJ + array.length;
            this.LIZJ = lizj;
            if (lizj > this.LIZIZ) {
                throw new EOFException();
            }
            if (this.LJFF.read(array, 0, array.length) == array.length) {
                return;
            }
            throw new IOException("Couldn't read up to the length of buffer");
        }
        
        @Override
        public final void readFully(final byte[] array, final int n, final int n2) {
            final int lizj = this.LIZJ + n2;
            this.LIZJ = lizj;
            if (lizj > this.LIZIZ) {
                throw new EOFException();
            }
            if (this.LJFF.read(array, n, n2) == n2) {
                return;
            }
            throw new IOException("Couldn't read up to the length of buffer");
        }
        
        @Override
        public final int readInt() {
            final int lizj = this.LIZJ + 4;
            this.LIZJ = lizj;
            if (lizj > this.LIZIZ) {
                throw new EOFException();
            }
            final int read = this.LJFF.read();
            final int read2 = this.LJFF.read();
            final int read3 = this.LJFF.read();
            final int read4 = this.LJFF.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            final ByteOrder liz = this.LIZ;
            if (liz == a.LIZLLL) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (liz == a.LJ) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            final StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.LIZ);
            throw new IOException(sb.toString());
        }
        
        @Override
        public final String readLine() {
            return null;
        }
        
        @Override
        public final long readLong() {
            final int lizj = this.LIZJ + 8;
            this.LIZJ = lizj;
            if (lizj > this.LIZIZ) {
                throw new EOFException();
            }
            final int read = this.LJFF.read();
            final int read2 = this.LJFF.read();
            final int read3 = this.LJFF.read();
            final int read4 = this.LJFF.read();
            final int read5 = this.LJFF.read();
            final int read6 = this.LJFF.read();
            final int read7 = this.LJFF.read();
            final int read8 = this.LJFF.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            final ByteOrder liz = this.LIZ;
            if (liz == a.LIZLLL) {
                return ((long)read8 << 56) + ((long)read7 << 48) + ((long)read6 << 40) + ((long)read5 << 32) + ((long)read4 << 24) + ((long)read3 << 16) + ((long)read2 << 8) + read;
            }
            if (liz == a.LJ) {
                return ((long)read << 56) + ((long)read2 << 48) + ((long)read3 << 40) + ((long)read4 << 32) + ((long)read5 << 24) + ((long)read6 << 16) + ((long)read7 << 8) + read8;
            }
            final StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.LIZ);
            throw new IOException(sb.toString());
        }
        
        @Override
        public final short readShort() {
            final int lizj = this.LIZJ + 2;
            this.LIZJ = lizj;
            if (lizj > this.LIZIZ) {
                throw new EOFException();
            }
            final int read = this.LJFF.read();
            final int read2 = this.LJFF.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            final ByteOrder liz = this.LIZ;
            if (liz == a.LIZLLL) {
                return (short)((read2 << 8) + read);
            }
            if (liz == a.LJ) {
                return (short)((read << 8) + read2);
            }
            final StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.LIZ);
            throw new IOException(sb.toString());
        }
        
        @Override
        public final String readUTF() {
            this.LIZJ += 2;
            return this.LJFF.readUTF();
        }
        
        @Override
        public final int readUnsignedByte() {
            ++this.LIZJ;
            return this.LJFF.readUnsignedByte();
        }
        
        @Override
        public final int readUnsignedShort() {
            final int lizj = this.LIZJ + 2;
            this.LIZJ = lizj;
            if (lizj > this.LIZIZ) {
                throw new EOFException();
            }
            final int read = this.LJFF.read();
            final int read2 = this.LJFF.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            final ByteOrder liz = this.LIZ;
            if (liz == a.LIZLLL) {
                return (read2 << 8) + read;
            }
            if (liz == a.LJ) {
                return (read << 8) + read2;
            }
            final StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.LIZ);
            throw new IOException(sb.toString());
        }
        
        @Override
        public final int skipBytes(int i) {
            int min;
            for (min = Math.min(i, this.LIZIZ - this.LIZJ), i = 0; i < min; i += this.LJFF.skipBytes(min - i)) {}
            this.LIZJ += i;
            return i;
        }
    }
    
    public static final class b
    {
        public final int LIZ;
        public final int LIZIZ;
        public final byte[] LIZJ;
        
        static {
            Covode.recordClassIndex(1024);
        }
        
        public b(final int liz, final int liziz, final byte[] lizj) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
        }
        
        public static b LIZ(final int n, final ByteOrder byteOrder) {
            return LIZ(new int[] { n }, byteOrder);
        }
        
        public static b LIZ(final long n, final ByteOrder byteOrder) {
            return LIZ(new long[] { n }, byteOrder);
        }
        
        public static b LIZ(final d d, final ByteOrder byteOrder) {
            return LIZ(new d[] { d }, byteOrder);
        }
        
        public static b LIZ(final String s) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append('\0');
            final byte[] bytes = sb.toString().getBytes(09t.LJII);
            return new b(2, bytes.length, bytes);
        }
        
        public static b LIZ(final int[] array, final ByteOrder byteOrder) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[09t.LJ[3] * 1]);
            wrap.order(byteOrder);
            int n = 0;
            do {
                wrap.putShort((short)array[0]);
            } while (++n <= 0);
            return new b(3, 1, wrap.array());
        }
        
        public static b LIZ(final long[] array, final ByteOrder byteOrder) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[09t.LJ[4] * 1]);
            wrap.order(byteOrder);
            int n = 0;
            do {
                wrap.putInt((int)array[0]);
            } while (++n <= 0);
            return new b(4, 1, wrap.array());
        }
        
        public static b LIZ(final d[] array, final ByteOrder byteOrder) {
            final ByteBuffer wrap = ByteBuffer.wrap(new byte[09t.LJ[5] * 1]);
            wrap.order(byteOrder);
            int n = 0;
            do {
                final d d = array[0];
                wrap.putInt((int)d.LIZ);
                wrap.putInt((int)d.LIZIZ);
            } while (++n <= 0);
            return new b(5, 1, wrap.array());
        }
        
        public final Object LIZ(final ByteOrder p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: astore_2       
            //     2: new             LX/09p;
            //     5: astore_3       
            //     6: aload_3        
            //     7: aload_0        
            //     8: getfield        X/09q.LIZJ:[B
            //    11: invokespecial   X/09p.<init>:([B)V
            //    14: aload_3        
            //    15: aload_1        
            //    16: putfield        X/09p.LIZ:Ljava/nio/ByteOrder;
            //    19: aload_0        
            //    20: getfield        X/09q.LIZ:I
            //    23: istore          4
            //    25: iconst_1       
            //    26: istore          5
            //    28: iconst_0       
            //    29: istore          6
            //    31: iconst_0       
            //    32: istore          7
            //    34: iconst_0       
            //    35: istore          8
            //    37: iconst_0       
            //    38: istore          9
            //    40: iconst_0       
            //    41: istore          10
            //    43: iconst_0       
            //    44: istore          11
            //    46: iconst_0       
            //    47: istore          12
            //    49: iconst_0       
            //    50: istore          13
            //    52: iconst_0       
            //    53: istore          14
            //    55: iload           4
            //    57: tableswitch {
            //                2: 126
            //                3: 201
            //                4: 348
            //                5: 384
            //                6: 424
            //                7: 126
            //                8: 201
            //                9: 476
            //               10: 516
            //               11: 556
            //               12: 610
            //               13: 651
            //          default: 120
            //        }
            //   120: aload_3        
            //   121: invokevirtual   X/09p.close:()V
            //   124: aconst_null    
            //   125: areturn        
            //   126: aload_0        
            //   127: getfield        X/09q.LIZJ:[B
            //   130: astore_1       
            //   131: aload_1        
            //   132: arraylength    
            //   133: iconst_1       
            //   134: if_icmpne       180
            //   137: aload_1        
            //   138: iconst_0       
            //   139: baload         
            //   140: iflt            180
            //   143: aload_1        
            //   144: iconst_0       
            //   145: baload         
            //   146: iconst_1       
            //   147: if_icmpgt       180
            //   150: new             Ljava/lang/String;
            //   153: dup            
            //   154: iconst_1       
            //   155: newarray        C
            //   157: dup            
            //   158: iconst_0       
            //   159: aload_0        
            //   160: getfield        X/09q.LIZJ:[B
            //   163: iconst_0       
            //   164: baload         
            //   165: bipush          48
            //   167: iadd           
            //   168: i2c            
            //   169: castore        
            //   170: invokespecial   java/lang/String.<init>:([C)V
            //   173: astore_1       
            //   174: aload_3        
            //   175: invokevirtual   X/09p.close:()V
            //   178: aload_1        
            //   179: areturn        
            //   180: new             Ljava/lang/String;
            //   183: dup            
            //   184: aload_0        
            //   185: getfield        X/09q.LIZJ:[B
            //   188: getstatic       X/09t.LJII:Ljava/nio/charset/Charset;
            //   191: invokespecial   java/lang/String.<init>:([BLjava/nio/charset/Charset;)V
            //   194: astore_1       
            //   195: aload_3        
            //   196: invokevirtual   X/09p.close:()V
            //   199: aload_1        
            //   200: areturn        
            //   201: iload           14
            //   203: istore          6
            //   205: aload_0        
            //   206: getfield        X/09q.LIZIZ:I
            //   209: getstatic       X/09t.LJFF:[B
            //   212: arraylength    
            //   213: if_icmplt       275
            //   216: iconst_0       
            //   217: istore          6
            //   219: iload           5
            //   221: istore          7
            //   223: iload           6
            //   225: getstatic       X/09t.LJFF:[B
            //   228: arraylength    
            //   229: if_icmpge       260
            //   232: aload_0        
            //   233: getfield        X/09q.LIZJ:[B
            //   236: iload           6
            //   238: baload         
            //   239: getstatic       X/09t.LJFF:[B
            //   242: iload           6
            //   244: baload         
            //   245: if_icmpeq       251
            //   248: goto            257
            //   251: iinc            6, 1
            //   254: goto            219
            //   257: iconst_0       
            //   258: istore          7
            //   260: iload           14
            //   262: istore          6
            //   264: iload           7
            //   266: ifeq            275
            //   269: getstatic       X/09t.LJFF:[B
            //   272: arraylength    
            //   273: istore          6
            //   275: new             Ljava/lang/StringBuilder;
            //   278: astore_1       
            //   279: aload_1        
            //   280: invokespecial   java/lang/StringBuilder.<init>:()V
            //   283: iload           6
            //   285: aload_0        
            //   286: getfield        X/09q.LIZIZ:I
            //   289: if_icmpge       337
            //   292: aload_0        
            //   293: getfield        X/09q.LIZJ:[B
            //   296: iload           6
            //   298: baload         
            //   299: istore          7
            //   301: iload           7
            //   303: ifeq            337
            //   306: iload           7
            //   308: bipush          32
            //   310: if_icmplt       324
            //   313: aload_1        
            //   314: iload           7
            //   316: i2c            
            //   317: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
            //   320: pop            
            //   321: goto            331
            //   324: aload_1        
            //   325: bipush          63
            //   327: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
            //   330: pop            
            //   331: iinc            6, 1
            //   334: goto            283
            //   337: aload_1        
            //   338: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   341: astore_1       
            //   342: aload_3        
            //   343: invokevirtual   X/09p.close:()V
            //   346: aload_1        
            //   347: areturn        
            //   348: aload_0        
            //   349: getfield        X/09q.LIZIZ:I
            //   352: newarray        I
            //   354: astore_1       
            //   355: iload           6
            //   357: aload_0        
            //   358: getfield        X/09q.LIZIZ:I
            //   361: if_icmpge       378
            //   364: aload_1        
            //   365: iload           6
            //   367: aload_3        
            //   368: invokevirtual   X/09p.readUnsignedShort:()I
            //   371: iastore        
            //   372: iinc            6, 1
            //   375: goto            355
            //   378: aload_3        
            //   379: invokevirtual   X/09p.close:()V
            //   382: aload_1        
            //   383: areturn        
            //   384: aload_0        
            //   385: getfield        X/09q.LIZIZ:I
            //   388: newarray        J
            //   390: astore_1       
            //   391: iload           7
            //   393: istore          6
            //   395: iload           6
            //   397: aload_0        
            //   398: getfield        X/09q.LIZIZ:I
            //   401: if_icmpge       418
            //   404: aload_1        
            //   405: iload           6
            //   407: aload_3        
            //   408: invokevirtual   X/09p.LIZ:()J
            //   411: lastore        
            //   412: iinc            6, 1
            //   415: goto            395
            //   418: aload_3        
            //   419: invokevirtual   X/09p.close:()V
            //   422: aload_1        
            //   423: areturn        
            //   424: aload_0        
            //   425: getfield        X/09q.LIZIZ:I
            //   428: anewarray       LX/09s;
            //   431: astore_1       
            //   432: iload           8
            //   434: istore          6
            //   436: iload           6
            //   438: aload_0        
            //   439: getfield        X/09q.LIZIZ:I
            //   442: if_icmpge       470
            //   445: aload_1        
            //   446: iload           6
            //   448: new             LX/09s;
            //   451: dup            
            //   452: aload_3        
            //   453: invokevirtual   X/09p.LIZ:()J
            //   456: aload_3        
            //   457: invokevirtual   X/09p.LIZ:()J
            //   460: invokespecial   X/09s.<init>:(JJ)V
            //   463: aastore        
            //   464: iinc            6, 1
            //   467: goto            436
            //   470: aload_3        
            //   471: invokevirtual   X/09p.close:()V
            //   474: aload_1        
            //   475: areturn        
            //   476: aload_0        
            //   477: getfield        X/09q.LIZIZ:I
            //   480: newarray        I
            //   482: astore_1       
            //   483: iload           9
            //   485: istore          6
            //   487: iload           6
            //   489: aload_0        
            //   490: getfield        X/09q.LIZIZ:I
            //   493: if_icmpge       510
            //   496: aload_1        
            //   497: iload           6
            //   499: aload_3        
            //   500: invokevirtual   X/09p.readShort:()S
            //   503: iastore        
            //   504: iinc            6, 1
            //   507: goto            487
            //   510: aload_3        
            //   511: invokevirtual   X/09p.close:()V
            //   514: aload_1        
            //   515: areturn        
            //   516: aload_0        
            //   517: getfield        X/09q.LIZIZ:I
            //   520: newarray        I
            //   522: astore_1       
            //   523: iload           10
            //   525: istore          6
            //   527: iload           6
            //   529: aload_0        
            //   530: getfield        X/09q.LIZIZ:I
            //   533: if_icmpge       550
            //   536: aload_1        
            //   537: iload           6
            //   539: aload_3        
            //   540: invokevirtual   X/09p.readInt:()I
            //   543: iastore        
            //   544: iinc            6, 1
            //   547: goto            527
            //   550: aload_3        
            //   551: invokevirtual   X/09p.close:()V
            //   554: aload_1        
            //   555: areturn        
            //   556: aload_0        
            //   557: getfield        X/09q.LIZIZ:I
            //   560: anewarray       LX/09s;
            //   563: astore_1       
            //   564: iload           11
            //   566: istore          6
            //   568: iload           6
            //   570: aload_0        
            //   571: getfield        X/09q.LIZIZ:I
            //   574: if_icmpge       604
            //   577: aload_1        
            //   578: iload           6
            //   580: new             LX/09s;
            //   583: dup            
            //   584: aload_3        
            //   585: invokevirtual   X/09p.readInt:()I
            //   588: i2l            
            //   589: aload_3        
            //   590: invokevirtual   X/09p.readInt:()I
            //   593: i2l            
            //   594: invokespecial   X/09s.<init>:(JJ)V
            //   597: aastore        
            //   598: iinc            6, 1
            //   601: goto            568
            //   604: aload_3        
            //   605: invokevirtual   X/09p.close:()V
            //   608: aload_1        
            //   609: areturn        
            //   610: aload_0        
            //   611: getfield        X/09q.LIZIZ:I
            //   614: newarray        D
            //   616: astore_1       
            //   617: iload           12
            //   619: istore          6
            //   621: iload           6
            //   623: aload_0        
            //   624: getfield        X/09q.LIZIZ:I
            //   627: if_icmpge       645
            //   630: aload_1        
            //   631: iload           6
            //   633: aload_3        
            //   634: invokevirtual   X/09p.readFloat:()F
            //   637: f2d            
            //   638: dastore        
            //   639: iinc            6, 1
            //   642: goto            621
            //   645: aload_3        
            //   646: invokevirtual   X/09p.close:()V
            //   649: aload_1        
            //   650: areturn        
            //   651: aload_0        
            //   652: getfield        X/09q.LIZIZ:I
            //   655: newarray        D
            //   657: astore_1       
            //   658: iload           13
            //   660: istore          6
            //   662: iload           6
            //   664: aload_0        
            //   665: getfield        X/09q.LIZIZ:I
            //   668: if_icmpge       685
            //   671: aload_1        
            //   672: iload           6
            //   674: aload_3        
            //   675: invokevirtual   X/09p.readDouble:()D
            //   678: dastore        
            //   679: iinc            6, 1
            //   682: goto            662
            //   685: aload_3        
            //   686: invokevirtual   X/09p.close:()V
            //   689: aload_1        
            //   690: areturn        
            //   691: astore_1       
            //   692: aload_2        
            //   693: astore_3       
            //   694: goto            698
            //   697: astore_1       
            //   698: aload_3        
            //   699: ifnull          706
            //   702: aload_3        
            //   703: invokevirtual   X/09p.close:()V
            //   706: aload_1        
            //   707: athrow         
            //   708: astore_1       
            //   709: aconst_null    
            //   710: astore_3       
            //   711: aload_3        
            //   712: ifnull          719
            //   715: aload_3        
            //   716: invokevirtual   X/09p.close:()V
            //   719: aconst_null    
            //   720: areturn        
            //   721: astore_1       
            //   722: goto            711
            //   725: astore_1       
            //   726: goto            124
            //   729: astore_3       
            //   730: goto            178
            //   733: astore_3       
            //   734: goto            199
            //   737: astore_3       
            //   738: goto            346
            //   741: astore_3       
            //   742: goto            382
            //   745: astore_3       
            //   746: goto            422
            //   749: astore_3       
            //   750: goto            474
            //   753: astore_3       
            //   754: goto            514
            //   757: astore_3       
            //   758: goto            554
            //   761: astore_3       
            //   762: goto            608
            //   765: astore_3       
            //   766: goto            649
            //   769: astore_3       
            //   770: goto            689
            //   773: astore_3       
            //   774: goto            706
            //   777: astore_1       
            //   778: goto            719
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  2      14     708    711    Ljava/io/IOException;
            //  2      14     691    697    Any
            //  14     25     721    725    Ljava/io/IOException;
            //  14     25     697    698    Any
            //  120    124    725    729    Ljava/io/IOException;
            //  126    137    721    725    Ljava/io/IOException;
            //  126    137    697    698    Any
            //  150    174    721    725    Ljava/io/IOException;
            //  150    174    697    698    Any
            //  174    178    729    733    Ljava/io/IOException;
            //  180    195    721    725    Ljava/io/IOException;
            //  180    195    697    698    Any
            //  195    199    733    737    Ljava/io/IOException;
            //  205    216    721    725    Ljava/io/IOException;
            //  205    216    697    698    Any
            //  223    248    721    725    Ljava/io/IOException;
            //  223    248    697    698    Any
            //  269    275    721    725    Ljava/io/IOException;
            //  269    275    697    698    Any
            //  275    283    721    725    Ljava/io/IOException;
            //  275    283    697    698    Any
            //  283    301    721    725    Ljava/io/IOException;
            //  283    301    697    698    Any
            //  313    321    721    725    Ljava/io/IOException;
            //  313    321    697    698    Any
            //  324    331    721    725    Ljava/io/IOException;
            //  324    331    697    698    Any
            //  337    342    721    725    Ljava/io/IOException;
            //  337    342    697    698    Any
            //  342    346    737    741    Ljava/io/IOException;
            //  348    355    721    725    Ljava/io/IOException;
            //  348    355    697    698    Any
            //  355    372    721    725    Ljava/io/IOException;
            //  355    372    697    698    Any
            //  378    382    741    745    Ljava/io/IOException;
            //  384    391    721    725    Ljava/io/IOException;
            //  384    391    697    698    Any
            //  395    412    721    725    Ljava/io/IOException;
            //  395    412    697    698    Any
            //  418    422    745    749    Ljava/io/IOException;
            //  424    432    721    725    Ljava/io/IOException;
            //  424    432    697    698    Any
            //  436    464    721    725    Ljava/io/IOException;
            //  436    464    697    698    Any
            //  470    474    749    753    Ljava/io/IOException;
            //  476    483    721    725    Ljava/io/IOException;
            //  476    483    697    698    Any
            //  487    504    721    725    Ljava/io/IOException;
            //  487    504    697    698    Any
            //  510    514    753    757    Ljava/io/IOException;
            //  516    523    721    725    Ljava/io/IOException;
            //  516    523    697    698    Any
            //  527    544    721    725    Ljava/io/IOException;
            //  527    544    697    698    Any
            //  550    554    757    761    Ljava/io/IOException;
            //  556    564    721    725    Ljava/io/IOException;
            //  556    564    697    698    Any
            //  568    598    721    725    Ljava/io/IOException;
            //  568    598    697    698    Any
            //  604    608    761    765    Ljava/io/IOException;
            //  610    617    721    725    Ljava/io/IOException;
            //  610    617    697    698    Any
            //  621    639    721    725    Ljava/io/IOException;
            //  621    639    697    698    Any
            //  645    649    765    769    Ljava/io/IOException;
            //  651    658    721    725    Ljava/io/IOException;
            //  651    658    697    698    Any
            //  662    679    721    725    Ljava/io/IOException;
            //  662    679    697    698    Any
            //  685    689    769    773    Ljava/io/IOException;
            //  702    706    773    777    Ljava/io/IOException;
            //  715    719    777    781    Ljava/io/IOException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 388, Size: 388
            //     at java.util.ArrayList.rangeCheck(Unknown Source)
            //     at java.util.ArrayList.get(Unknown Source)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public final int LIZIZ(final ByteOrder byteOrder) {
            final Object liz = this.LIZ(byteOrder);
            if (liz == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (liz instanceof String) {
                return Integer.parseInt((String)liz);
            }
            if (liz instanceof long[]) {
                final long[] array = (long[])liz;
                if (array.length == 1) {
                    return (int)array[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            else {
                if (!(liz instanceof int[])) {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
                final int[] array2 = (int[])liz;
                if (array2.length == 1) {
                    return array2[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
        }
        
        public final String LIZJ(final ByteOrder byteOrder) {
            final Object liz = this.LIZ(byteOrder);
            if (liz == null) {
                return null;
            }
            if (liz instanceof String) {
                return (String)liz;
            }
            final StringBuilder sb = new StringBuilder();
            final boolean b = liz instanceof long[];
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            int i = 0;
            if (b) {
                int n4;
                for (long[] array = (long[])liz; i < array.length; i = n4) {
                    sb.append(array[i]);
                    n4 = i + 1;
                    if ((i = n4) != array.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (liz instanceof int[]) {
                final int[] array2 = (int[])liz;
                int n5;
                for (int j = n; j < array2.length; j = n5) {
                    sb.append(array2[j]);
                    n5 = j + 1;
                    if ((j = n5) != array2.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (liz instanceof double[]) {
                final double[] array3 = (double[])liz;
                int n6;
                for (int k = n2; k < array3.length; k = n6) {
                    sb.append(array3[k]);
                    n6 = k + 1;
                    if ((k = n6) != array3.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (liz instanceof d[]) {
                final d[] array4 = (d[])liz;
                int n7;
                for (int l = n3; l < array4.length; l = n7) {
                    sb.append(array4[l].LIZ);
                    sb.append('/');
                    sb.append(array4[l].LIZIZ);
                    n7 = l + 1;
                    if ((l = n7) != array4.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            return null;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("(");
            sb.append(09t.LIZLLL[this.LIZ]);
            sb.append(", data length:");
            sb.append(this.LIZJ.length);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final int LIZ;
        public final String LIZIZ;
        public final int LIZJ;
        public final int LIZLLL;
        
        static {
            Covode.recordClassIndex(1025);
        }
        
        public c(final String liziz, final int liz) {
            this.LIZIZ = liziz;
            this.LIZ = liz;
            this.LIZJ = 3;
            this.LIZLLL = 4;
        }
        
        public c(final String liziz, final int liz, final int lizj) {
            this.LIZIZ = liziz;
            this.LIZ = liz;
            this.LIZJ = lizj;
            this.LIZLLL = -1;
        }
        
        public final boolean LIZ(final int n) {
            final int lizj = this.LIZJ;
            if (lizj != 7 && n != 7 && lizj != n) {
                final int lizlll = this.LIZLLL;
                if (lizlll != n) {
                    return ((lizj == 4 || lizlll == 4) && n == 3) || ((lizj == 9 || lizlll == 9) && n == 8) || ((lizj == 12 || lizlll == 12) && n == 11);
                }
            }
            return true;
        }
    }
    
    public static final class d
    {
        public final long LIZ;
        public final long LIZIZ;
        
        static {
            Covode.recordClassIndex(1026);
        }
        
        public d(final long liz, final long liziz) {
            if (liziz == 0L) {
                this.LIZ = 0L;
                this.LIZIZ = 1L;
                return;
            }
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.LIZ);
            sb.append("/");
            sb.append(this.LIZIZ);
            return sb.toString();
        }
    }
}
