import { ISchedule } from 'app/entities/schedule/schedule.model';

export interface ILocation {
  id?: number;
  branchName?: string | null;
  address?: number | null;
  locSches?: ISchedule[] | null;
}

export class Location implements ILocation {
  constructor(
    public id?: number,
    public branchName?: string | null,
    public address?: number | null,
    public locSches?: ISchedule[] | null
  ) {}
}

export function getLocationIdentifier(location: ILocation): number | undefined {
  return location.id;
}
