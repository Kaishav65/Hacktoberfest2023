export const Months: string[] = [
    "Jan",
    "Feb",
    "Mar",
    "Apr",
    "May",
    "Jun",
    "Jul",
    "Aug",
    "Sep",
    "Oct",
    "Nov",
    "Dec",
];

export const WeekDays: string[] = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

export const FormatDate = (date: Date) => {
    let diff: number =
        new Date(new Date().getFullYear(), new Date().getMonth(), new Date().getDate()).getTime() -
        date.getTime();

    if (diff <= 0) {
        diff = -diff;
        // future and Today
        if (diff >= 1000 * 60 * 60 * 24 * 7) {
            // +7 days
            return `${date.getDate()}th ${Months[date.getMonth()]}`;
        } else if (diff >= 1000 * 60 * 60 * 24 * 2) {
            // +2 days
            return `${WeekDays[date.getDay()]}`;
        } else if (diff >= 1000 * 60 * 60 * 24) {
            // +1 dia
            return "Tomorrow";
        } else {
            return "Today";
        }
    } else {
        if (diff >= 1000 * 60 * 60 * 24 * 2) {
            // -2 days
            return `${date.getDate()}th ${Months[date.getMonth()]}`;
        } else if (diff >= 1000 * 60 * 60 * 24) {
            // -1 day
            return "Yesterday";
        } else {
            return "Today";
        }
    }
};