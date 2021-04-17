import * as dayjs from 'dayjs';
import { ILocation } from 'app/entities/location/location.model';
import { IFitnessClass } from 'app/entities/fitness-class/fitness-class.model';

export interface ISchedule {
  id?: number;
  dateTime?: dayjs.Dayjs | null;
  availableSlots?: number | null;
  schLoc?: ILocation | null;
  schFit?: IFitnessClass | null;
}

export class Schedule implements ISchedule {
  constructor(
    public id?: number,
    public dateTime?: dayjs.Dayjs | null,
    public availableSlots?: number | null,
    public schLoc?: ILocation | null,
    public schFit?: IFitnessClass | null
  ) {}
}

export function getScheduleIdentifier(schedule: ISchedule): number | undefined {
  return schedule.id;
}
