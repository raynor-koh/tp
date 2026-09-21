package seedu.address.logic.commands;

import org.junit.jupiter.api.Test;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;

public class RemarkCommandTest {
    private final Model model = new ModelManager(getTypicalAddressBook());

    @Test
    public void execute() {
        assertCommandFailure(new RemarkCommand(), model, RemarkCommand.MESSAGE_NOT_IMPLEMENTED_YET);
    }
}
