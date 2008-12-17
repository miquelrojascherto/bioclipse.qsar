package net.bioclipse.qsar.ui.editors;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
/**
 * Class to be able to ask for confirmation iside a non-UI thread
 * @author ola
 *
 */
public class ConfirmRunnable implements Runnable{
        public boolean answer;
        private Shell shell;
        private String contents;
        private String title;
        public ConfirmRunnable(Shell shell, String title, String contents) {
                this.shell=shell;
                this.title=title;
                this.contents=contents;
        }
        public void run() {
                        answer=MessageDialog.openQuestion(shell, title, contents);
        }
        public boolean getAnswer() {
                return answer;
        }
}
