package club.issizler.okyanus.api.cmd;

public class CommandSource {

    /** Is this source the server console? */
    public boolean isConsole() {
        return false;
    }

    /**
     * Send a message to this source.
     *
     * This is either a chat message, in case of a player, or a console log
     * message.
     */
    public void send(String string) {
    }

}