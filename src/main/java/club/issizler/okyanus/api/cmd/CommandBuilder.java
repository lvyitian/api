package club.issizler.okyanus.api.cmd;

/**
 * This is a builder for chat commands
 */
public class CommandBuilder {

    /**
     * Sets the command name
     * @param name Command name
     * @return The builder
     */
    public CommandBuilder name(String name) {
        return this;
    }

    /**
     * Marks the command as OP only
     * @return The builder
     */
    public CommandBuilder opOnly() {
        return this;
    }

    /**
     * Adds an argument to this command
     * @param name Argument name
     * @param type Argument type
     * @return The builder
     */
    public CommandBuilder arg(String name, ArgumentType type) {
        return this;
    }

    /**
     * Links the {@link club.issizler.okyanus.api.cmd.CommandRunnable} of your command
     *
     * @param runnable The runnable of your command
     * @return The builder
     */
    public CommandBuilder run(CommandRunnable runnable) {
        return this;
    }

}
