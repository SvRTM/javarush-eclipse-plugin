package javarush.eclipse.core.utils;

import java.util.Calendar;
import java.util.Date;

public enum SessionSingleton {
    INSTANCE {
        private final Object lock = new Object();

        private String id;
        private Date dateCreate;

        @Override
        public void setId(String sessionId) {
            synchronized (lock) {
                id = sessionId;
                dateCreate = new Date();
            }
        }

        @Override
        public String getId(int lifetime) {
            synchronized (lock) {
                if (dateCreate == null || id == null || isTimeOver(lifetime))
                    return null;

                dateCreate = new Date();
                return id;
            }
        }

        private boolean isTimeOver(int lifetime) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateCreate);
            calendar.add(Calendar.MINUTE, lifetime);

            return calendar.compareTo(Calendar.getInstance()) == -1;
        }
    };

    public abstract void setId(String sessionId);

    public abstract String getId(int lifetime);

}
