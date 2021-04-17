import { ISchedule } from 'app/entities/schedule/schedule.model';

export interface IFitnessClass {
  id?: number;
  className?: string | null;
  duration?: number | null;
  level?: string | null;
  instructorName?: string | null;
  fitSches?: ISchedule[] | null;
}

export class FitnessClass implements IFitnessClass {
  constructor(
    public id?: number,
    public className?: string | null,
    public duration?: number | null,
    public level?: string | null,
    public instructorName?: string | null,
    public fitSches?: ISchedule[] | null
  ) {}
}

export function getFitnessClassIdentifier(fitnessClass: IFitnessClass): number | undefined {
  return fitnessClass.id;
}
