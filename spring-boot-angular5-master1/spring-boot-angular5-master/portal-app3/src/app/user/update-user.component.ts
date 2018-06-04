import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { UserService } from './user.service';

@Component({
  templateUrl: './update-user.component.html'
})
export class UpdateUserComponent {

  user: User = new User();

  constructor(private router: Router, private userService: UserService) {

  }

  updateUser(): void {
    this.userService.updateUser(this.user)
        .subscribe( data => {
          alert('User updated successfully.');
        });

  }

}
