package ua.nure.sorokina;

public class Encoder {
    public static String encode(String message) {
        StringBuilder code = new StringBuilder();
        byte[] messageBytes;
        int prevBit = -1;
        int currentBit;

        try {
            messageBytes = message.getBytes();
        } catch (NullPointerException e) {
            messageBytes = new byte[] {};
            System.out.println("Null value has been provided!");
        }

        for (byte messageByte : messageBytes) {
            for (int j = 6; j >= 0; j--) {
                currentBit = messageByte >> j & 1;
                if (prevBit == currentBit) {
                    code.append("0");
                } else {
                    code.append(" ");
                    if (currentBit == 1) {
                        code.append("0 0");
                    } else {
                        code.append("00 0");
                    }
                }
                prevBit = currentBit;
            }
        }

        return (code.length() > 0) ? code.substring(1) : code.toString();
    }
}
