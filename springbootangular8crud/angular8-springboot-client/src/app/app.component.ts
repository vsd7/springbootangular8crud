import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from './login/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  isLoggedIn = false;
  constructor(private route: ActivatedRoute,
    private router: Router,
    private authService: AuthService) { }

  ngOnInit() {
    this.isLoggedIn = this.authService.isUserLoggedIn();
    console.log(this.isLoggedIn);
  }
  title = 'angular8-springboot-client';
  
}
